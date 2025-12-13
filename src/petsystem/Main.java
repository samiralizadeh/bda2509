package petsystem;

public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Happy Paws");

        Pet pet1 = new Pet("Buddy", "Dog", 3);
        Pet pet2 = new Pet("Milo", "Cat", 2);

        Adopter adopter = new Adopter("Alice", 25);

        shelter.showInfo()
        pet1.displayInfo();
        pet2.displayInfo();

        adopter.adoptPet(pet1);
        adopter.adoptPet(pet1);

        pet1.displayInfo();
    }
}
