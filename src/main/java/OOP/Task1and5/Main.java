package OOP.Task1and5;

public class Main {
    public static void main(String[] args) {
    Point2D point2D = new Point2D(1, 10);
    point2D.setXT(100, 1000);

    Point3D point3D = new Point3D(5,15, 50);
    point3D.setXYZ(500, 1500,5000);

    Line line = new Line(5, 15, 8, 16);

        System.out.println(point2D);
        System.out.println(point3D);
        System.out.println(line.calculateLength());
    }
}
