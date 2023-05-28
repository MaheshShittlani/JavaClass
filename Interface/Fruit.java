abstract public class Fruit {
    private String flavor;
    private String color;

    public Fruit(String flavor, String color) {
        this.flavor = flavor;
        this.color = color;
    }

    abstract public String getColor();
    
    abstract public String getFlavor();
}
