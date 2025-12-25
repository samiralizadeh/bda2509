package petsystem;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        Pet other = (Pet) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
