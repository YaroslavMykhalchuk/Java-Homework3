package Task5;

public class Ukulele extends MusicalInstrument{
    public Ukulele(String name, String description) {
        super(name, description);
    }

    public void sound() {
        System.out.println("Sound: Pulyunk");
    }

    public void show() {
        System.out.println("Name instrument: " + getName());
    }

    public void desc() {
        System.out.println("Description instrument: " + getDescription());
    }

    public void history() {
        System.out.println("History instrument: Ukulele history");
    }
}
