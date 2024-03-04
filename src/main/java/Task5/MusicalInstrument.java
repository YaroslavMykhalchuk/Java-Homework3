package Task5;

public class MusicalInstrument {
    private String name;
    private String description;

    public MusicalInstrument() {
        this("no name", "no description");
    }
    public MusicalInstrument(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
