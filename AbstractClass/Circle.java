public class Circle extends GeomatricShapes{
    private int radius;

    public Circle(int radius, String color, boolean isFilled) {
        super(color,isFilled);
        this.radius = radius;
    }
    public Circle(String color, boolean isFilled) {
        this(1, color, isFilled);
    }

    public Circle(String color) {
        this(color,false);
    }

    public Circle(int radius) {
        this(radius,"white",false);
    }

    public void setRadius(int radius) {
        if(radius <= 0) {
            System.out.println("Invalid radius");
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        super.display();
        System.out.println("Radius: "+ getRadius());
        // System.out.println("Perimeter: "+ getPerimeter());
        System.out.println("-----------------------------------");
    }

    public String toString() {
        return "Radius: "+radius;
    }
    
}
