package petsystem;

public class Pet {
    private String name;
    private String type;
    private int age;
    private boolean adopted;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.adopted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public void displayInfo() {
        System.out.println(name + " (" + type + "), age: " + age +
                ", adopted: " + adopted);
    }
}
