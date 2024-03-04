package Task5;

public class Cello extends MusicalInstrument{
    public Cello(String name, String description) {
        super(name, description);
    }

    public void sound() {
        System.out.println("Sound: Pilyunk");
    }

    public void show() {
        System.out.println("Name instrument: " + getName());
    }

    public void desc() {
        System.out.println("Description instrument: " + getDescription());
    }

    public void history() {
        System.out.println("History instrument: Cello history");
    }
}
