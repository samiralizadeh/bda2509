package petsystem;

import java.util.Objects;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return "Pet";
    }

    @Override
    public String toString() {
        return getType() + ": " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return name.equals(pet.name) && getType().equals(pet.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getType());
    }
}
