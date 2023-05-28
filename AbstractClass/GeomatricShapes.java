import java.util.Date;;
abstract public class GeomatricShapes {
    private String color = "White";
    private boolean isFilled;
    private Date dateCreated;

    public GeomatricShapes(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = new Date();
    }

    public GeomatricShapes(String color) {
        this(color, false);
    }

    public GeomatricShapes() {
        this("white");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void display() {
        System.out.println("Color: "+ getColor());
        System.out.println("Is I am filled? "+ isFilled());
        System.out.println("Created on "+ getDateCreated());
    }

    abstract public double getArea();

    abstract public double getPerimeter();
}