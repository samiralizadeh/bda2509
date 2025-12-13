package petsystem;

public class Adopter {
    private String name;
    private int age;

    public Adopter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void adoptPet(Pet pet) {
        if (!pet.isAdopted()) {
            pet.setAdopted(true);
            System.out.println(name + " adopted " + pet.getName());
        } else {
            System.out.println("Pet already adopted");
        }
    }
}
