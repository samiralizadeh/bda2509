package petsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet name:");
        String name = scanner.nextLine();

        System.out.println("Enter pet type:");
        String type = scanner.nextLine();

        System.out.println("Enter pet age:");
        int age = scanner.nextInt();

        Pet pet = new Pet(name, type, age);

        pet.displayInfo();
    }
}
