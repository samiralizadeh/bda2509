package petsystem;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Pet> pets = new ArrayList<>();

    // add pet to shelter
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    // search pet by name
    public Pet findPet(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    // filtering: show only dogs
    public void showDogs() {
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                System.out.println(pet);
            }
        }
    }

    // sorting pets by name (simple bubble sort)
    public void sortByName() {
        for (int i = 0; i < pets.size() - 1; i++) {
            for (int j = i + 1; j < pets.size(); j++) {
                if (pets.get(i).getName().compareTo(pets.get(j).getName()) > 0) {
                    Pet temp = pets.get(i);
                    pets.set(i, pets.get(j));
                    pets.set(j, temp);
                }
            }
        }
    }

    // show all pets
    public void showPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
