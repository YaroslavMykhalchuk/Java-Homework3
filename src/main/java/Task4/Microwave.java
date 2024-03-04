package Task4;

public class Microwave extends Device {
    public Microwave(String name, String description) {
        super(name, description);
    }

    public void sound() {
        System.out.println("Sound: Beep-beep-beep");
    }

    public void show() {
        System.out.println("Name device: " + getName());
    }

    public void desc() {
        System.out.println("Description device: " + getDescription());
    }
}
