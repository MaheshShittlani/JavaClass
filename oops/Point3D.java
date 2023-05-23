public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        this(0,0,0);
    }

    public Point3D(int x, int y) {
        this(x, y, 0);
    }

    public Point3D(int x) {
        this(x, 0 , 0);
    }

    public void display() {
        System.out.println("x = "+ x +" y = "+ y +" z = "+z);
    }
}
