package Task1;

public class Builder extends Human {
    private String qualification;

    public Builder(String name, int age, String gender, String qualification) {
        super(name, age, gender);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Qualification: " + qualification);
    }
}
