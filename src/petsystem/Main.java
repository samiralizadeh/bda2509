package petsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shelter shelter = new Shelter();

        System.out.print("Enter dog name: ");
        String petName = scanner.nextLine();

        Pet pet = new Dog(petName);
        shelter.addPet(pet);

        System.out.print("Enter adopter name: ");
        String adopterName = scanner.nextLine();
        Adopter adopter = new Adopter(adopterName);

        Pet found = shelter.findPet(petName);
        adopter.adopt(found);

        shelter.sortByName();
        shelter.showPets();
    }
}
