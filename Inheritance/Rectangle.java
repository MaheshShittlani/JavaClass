public class Rectangle extends GeomatricShapes {
    private int x, y ;
    private int width, height;

    public Rectangle(int x, int y, int width, int height, String color, boolean isFilled) {
        super(color, isFilled);

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2* ( width + height);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Dimension <"+x+", "+y+", "+width+", "+height+">");
        System.out.println("-----------------------------------");
    }
}
