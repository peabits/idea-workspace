package chapter1.issue4.test;

import chapter1.issue4.solution.Cat;
import chapter1.issue4.solution.CatAndDogQueue;
import chapter1.issue4.solution.Dog;

public class CatAndDogQueueTest {

    public static void main(String[] args) throws Exception {
        CatAndDogQueue queue = new CatAndDogQueue();
        for (int i = 0; i < 5; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            queue.add(cat);
            queue.add(dog);
        }
        queue.pollCat();
        queue.pollDog();
        queue.pollAll();
        queue.pollAll();
    }

}
