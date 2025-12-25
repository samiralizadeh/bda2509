package petsystem;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public Pet findPet(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    public void showPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
