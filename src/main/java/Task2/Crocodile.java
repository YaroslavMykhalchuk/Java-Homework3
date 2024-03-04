package Task2;

public class Crocodile extends Animal {
    private String ration;

    public Crocodile() {
        super();
        ration = "hunger ration";
    }

    public Crocodile(String name, int age, String sound, String ration) {
        super(name, age, sound);
        this.ration = ration;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ration: " + ration);
    }
}
