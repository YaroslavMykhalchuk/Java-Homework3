package Task1;

public class Sailor extends Human {
    private String typeShip;

    public Sailor(String name, int age, String gender, String typeShip) {
        super(name, age, gender);
        this.typeShip = typeShip;
    }

    public String getTypeShip() {
        return typeShip;
    }

    public void setTypeShip(String typeShip) {
        this.typeShip = typeShip;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type ship: " + typeShip);
    }
}
