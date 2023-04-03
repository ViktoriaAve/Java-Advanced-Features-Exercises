package OOP.Task3and4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", true, 15);
        Rectangle rect = new Rectangle("Green", true, 10, 20);
        Square square = new Square("Yellow", true, 121);
        System.out.print("The circle area is ");
        circle.getArea();
        System.out.print("The circle perimeter is ");
        circle.getPerimeter();
        System.out.println();
        System.out.println(circle);
        System.out.println(rect);
        System.out.println(square);
    }
}
