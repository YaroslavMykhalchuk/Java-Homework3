package Task5Homework;

public class ForeignPassport extends Passport{
    private String foreignPassportNumber;
    private String visasInfo;

    public ForeignPassport(String name, String surname, String passportNumber, String foreignPassportNumber, String visasInfo) {
        super(name, surname, passportNumber);
        this.foreignPassportNumber = foreignPassportNumber;
        this.visasInfo = visasInfo;
    }

    public String getForeignPassportNumber() {
        return foreignPassportNumber;
    }

    public String getVisasInfo() {
        return visasInfo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Foreign Passport Number: " + foreignPassportNumber);
        System.out.println("Visas Information: " + visasInfo);
    }
}
