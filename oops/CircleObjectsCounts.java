class CircleObjectCounts {
    private int radius;
    public static int objCount;

    // Parameterize constructor
    public CircleObjectCounts(int radius) {
        this.radius = radius;
        objCount++;
    }

    // Default constructor
    public CircleObjectCounts() {
        this(1);
    }

    // Copy Constructor
    public CircleObjectCounts(CircleObjectCounts circle) {
        this(circle.radius);
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

class TestCircleObjectCount {
    public static void main(String[] args) {
        // Create circle object
        CircleObjectCounts c1 = new CircleObjectCounts();
        CircleObjectCounts c2 = new CircleObjectCounts(10);

        //c1.radius = 10; Error, becoz of private
        //c1.radius = -5; Error, becoze of private
        
        c1.setRadius(5);
        // c2.setRadius(10);

        CircleObjectCounts c3 = new CircleObjectCounts(c1);

        System.out.println("Area of circle with radius  "+ c1.getRadius() +" = "+ c1.getArea());
        System.out.println("Perimeter of circle with radius  "+ c1.getRadius()+" = "+ c1.getPerimeter());

        System.out.println("Area of circle with radius  "+ c2.getRadius() +" = "+ c2.getArea());
        System.out.println("Perimeter of circle with radius  "+ c2.getRadius()+" = "+ c2.getPerimeter());


        System.out.println("Number of object created...."+ CircleObjectCounts.objCount);
        
    }
}