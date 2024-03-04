package Task2;

public class Kangaroo extends Animal {
    private int jumpingDistance;

    public Kangaroo() {
        super();
        jumpingDistance = 0;
    }

    public Kangaroo(String name, int age, String sound, int jumpingDistance) {
        super(name, age, sound);
        this.jumpingDistance = jumpingDistance;
    }

    public int getJumpingDistance() {
        return jumpingDistance;
    }

    public void setJumpingDistance(int jumpingDistance) {
        this.jumpingDistance = jumpingDistance;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumping distance: " + jumpingDistance);
    }
}
