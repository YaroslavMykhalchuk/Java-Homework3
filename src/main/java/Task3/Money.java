package Task3;

public class Money {
    private int wholePart;
    private int fractionPart;

    public Money() {
        this(0, 0);
    }
    public Money(int wholePart, int fractionPart) {
        this.wholePart = wholePart;
        this.fractionPart = fractionPart;
    }

    public int getWholePart() {
        return wholePart;
    }

    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    public int getFractionPart() {
        return fractionPart;
    }

    public void setFractionPart(int fractionPart) {
        this.fractionPart = fractionPart;
    }

    public void display() {
        System.out.println(wholePart + "." + (fractionPart < 10 ? "0" : "") + fractionPart);
    }
}
