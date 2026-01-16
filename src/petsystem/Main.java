package petsystem;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog("Rex");

        PetDB.insertPet(dog);      // CREATE
        PetDB.showPets();          // READ
        PetDB.updatePet("Rex", "Max"); // UPDATE
        PetDB.deletePet("Max");    // DELETE
    }
}
