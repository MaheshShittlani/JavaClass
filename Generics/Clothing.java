public class Clothing implements Priceditems {
    private String type;
    private double price;

    public Clothing(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return type + " - " + price;
    }
}
