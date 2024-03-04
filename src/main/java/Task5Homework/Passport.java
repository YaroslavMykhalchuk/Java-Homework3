package Task5Homework;

public class Passport {
    private String name;
    private String surname;
    private String passportNumber;

    // Конструктор
    public Passport(String name, String surname, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void display() {
        System.out.println("Passport Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Passport Number: " + passportNumber);
    }
}
