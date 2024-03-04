package Task3;

public class Product {
    private String name;
    private Money price;

    public Product() {
        this("no product", new Money(0, 0));
    }

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void decreasePrice(int wholePart, int fractionPart) {
        int totalPriceDec = wholePart * 100 + fractionPart;
        int totalProductPrice = price.getWholePart() * 100 + price.getFractionPart();

        if (totalProductPrice - totalPriceDec < 0) {
            System.out.println("The price should not be negative!");
            return;
        }

        price.setWholePart((totalProductPrice - totalPriceDec) / 100);
        price.setFractionPart((totalProductPrice - totalPriceDec) % 100);
    }

    public void display() {
        System.out.print("Product: " + name + "\nPrice: ");
        price.display();
    }
}
