public class TestGeomatric {

    public static double compare(GeomatricShapes obj1, GeomatricShapes obj2) {
        return obj1.getArea() - obj2.getArea();
    }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(0, 0, 10, 20);
        

        double result = TestGeomatric.compare(c,r);

        if(result > 0) {
            System.out.println("Circle is bigger");
        } else if(result < 0) {
            System.out.println("Rectangle is bigger");
        } else {
            System.out.println("Both are equal");
        }
    }
}
