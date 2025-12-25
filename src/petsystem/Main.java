package petsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shelter shelter = new Shelter();

        System.out.println("Enter pet name:");
        String petName = scanner.nextLine();

        Pet pet = new Pet(petName);
        shelter.addPet(pet);

        System.out.println("Enter adopter name:");
        String adopterName = scanner.nextLine();

        Adopter adopter = new Adopter(adopterName);

        Pet found = shelter.findPet(petName);
        adopter.adopt(found);

        shelter.showPets();
    }
}