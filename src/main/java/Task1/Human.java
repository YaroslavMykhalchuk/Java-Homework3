package Task1;

public class Human {
    private String name;
    private int age;
    private String gender;
    private static int count = 0;
    
    public Human () {
        this("John Doe", 32, "man");
    }
    public Human(String name, int age, String gender) {
        count++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public void displayInfo() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nGender: " + gender);
    }
}
