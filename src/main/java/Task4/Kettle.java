package Task4;

public class Kettle extends Device {
    public Kettle(String name, String description) {
        super(name, description);
    }

    public void sound() {
        System.out.println("Sound: Bul-bul-bul");
    }

    public void show() {
        System.out.println("Name device: " + getName());
    }

    public void desc() {
        System.out.println("Description device: " + getDescription());
    }
}
