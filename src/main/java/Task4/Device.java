package Task4;

public class Device {
    private String name;
    private String description;

    public Device() {
        this("no name", "no description");
    }

    public Device(String name, String description) {
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
