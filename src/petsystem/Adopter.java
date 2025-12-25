package petsystem;

public class Adopter {

    private String name;

    public Adopter(String name) {
        this.name = name;
    }

    public void adopt(Pet pet) {
        System.out.println(name + " adopted " + pet.getName());
    }
}

