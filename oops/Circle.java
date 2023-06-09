class Circle {
    private int radius;

    // Default constructor
    public Circle() {
        radius = 1;
    }
    // Parameterize constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Copy Constructor
    public Circle(Circle circle) {
        this.radius =  circle.radius;
    }

    public void setRadius(int radius) {
        if(radius <= 0) {
            System.out.println("Invalid radius");
            return;
        } 
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        // Create circle object
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        //c1.radius = 10; Error, becoz of private
        //c1.radius = -5; Error, becoze of private
        
        c1.setRadius(5);
        // c2.setRadius(10);

        System.out.println("Area of circle with radius  "+ c1.getRadius() +" = "+ c1.getArea());
        System.out.println("Perimeter of circle with radius  "+ c1.getRadius()+" = "+ c1.getPerimeter());

        System.out.println("Area of circle with radius  "+ c2.getRadius() +" = "+ c2.getArea());
        System.out.println("Perimeter of circle with radius  "+ c2.getRadius()+" = "+ c2.getPerimeter());


        Circle c3 = new Circle(c1);
        System.out.println("Area of circle with radius  "+ c3.getRadius() +" = "+ c3.getArea());
        System.out.println("Perimeter of circle with radius  "+ c3.getRadius()+" = "+ c3.getPerimeter());

        c2.setRadius(5);
    }
}