package Task2;

public class Tiger extends Animal {
    private String stripePattern;

    public Tiger() {
        super();
        stripePattern = "default";
    }

    public Tiger(String name, int age, String sound, String stripePattern) {
        super(name, age, sound);
        this.stripePattern = stripePattern;
    }

    public String getStripePattern() {
        return stripePattern;
    }

    public void setStripePattern(String stripePattern) {
        this.stripePattern = stripePattern;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Stripe pattern: " + stripePattern);
    }
}
