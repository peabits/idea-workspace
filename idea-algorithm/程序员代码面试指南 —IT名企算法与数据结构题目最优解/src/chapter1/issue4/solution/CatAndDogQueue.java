package chapter1.issue4.solution;

import java.util.LinkedList;
import java.util.Queue;

public class CatAndDogQueue {

    private Queue<PetWithOrder> catQ;
    private Queue<PetWithOrder> dogQ;
    private int count;

    public CatAndDogQueue() {
        catQ = new LinkedList<>();
        dogQ = new LinkedList<>();
        count = 0;
    }

    public void add(Pet pet) throws Exception {
        if (pet instanceof Cat) {
            PetWithOrder pwo = new PetWithOrder(pet, count++);
            catQ.add(pwo);
        } else if (pet instanceof Dog) {
            PetWithOrder pwo = new PetWithOrder(pet, count++);
            dogQ.add(pwo);
        } else {
            throw new RuntimeException("Not Cat or Dog!");
        }
    }

    public Pet pollAll() throws Exception {
        if (!this.catQ.isEmpty() && !this.dogQ.isEmpty()) {
            if (this.catQ.peek().getOrder() < this.dogQ.peek().getOrder()) {
                return this.catQ.poll().getPet();
            } else {
                return this.dogQ.poll().getPet();
            }
        } else if (!this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else if (!this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("栈为空！");
        }
    }

    public Pet pollCat() throws Exception {
        if (!this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("栈为空！");
        }
    }

    public Pet pollDog() throws Exception {
        if (!this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("栈为空！");
        }
    }

    public boolean isEmpty() {
        return this.catQ.isEmpty() && this.dogQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return this.catQ.isEmpty();
    }

    public boolean isDogEmpty() {
        return this.dogQ.isEmpty();
    }

}
