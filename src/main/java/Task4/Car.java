package Task4;

public class Car extends Device {
    public Car(String name, String description) {
        super(name, description);
    }

    public void sound() {
        System.out.println("Sound: Vrym-vrym");
    }

    public void show() {
        System.out.println("Name device: " + getName());
    }

    public void desc() {
        System.out.println("Description device: " + getDescription());
    }
}
