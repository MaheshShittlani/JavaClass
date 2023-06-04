public class Electronics implements Priceditems{
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return name+" - "+price;
    }
}
