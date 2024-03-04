package Task1;

public class Pilot extends Human {
    public String typePlane;

    public Pilot(String name, int age, String gender, String typePlane) {
        super(name, age, gender);
        this.typePlane = typePlane;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type plane: " + typePlane);
    }
}
