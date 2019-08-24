package chapter1.issue4.solution;

public class PetWithOrder {

    private Pet pet;
    private int order;

    public PetWithOrder(Pet pet, int order) {
        this.pet = pet;
        this.order = order;
    }

    public Pet getPet() {
        return pet;
    }

    public int getOrder() {
        return order;
    }

    public String getPetType() {
        return this.pet.getPetType();
    }

}
