package Task4;

public class Steambot extends Device {
    public Steambot(String name, String description) {
        super(name, description);
    }

    public void sound() {
        System.out.println("Sound: Viy-viy");
    }

    public void show() {
        System.out.println("Name device: " + getName());
    }

    public void desc() {
        System.out.println("Description device: " + getDescription());
    }
}
