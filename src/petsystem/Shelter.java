package petsystem;

public class Shelter {
    private String name;

    public Shelter(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Shelter name: " + name);
    }
}

