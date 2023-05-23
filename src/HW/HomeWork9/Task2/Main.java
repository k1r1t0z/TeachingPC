package HW.HomeWork9.Task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(15, 15, 15);
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(15, 10, 15, 10);
        triangle.square();
        System.out.println(triangle.perimeter());
        circle.square();
        System.out.println(circle.perimeter());
        rectangle.square();
        System.out.println(rectangle.perimeter());
        Figure[] figure = new Figure[3];
        figure[0] = new Circle(10);
        figure[1] = new Rectangle(15, 10, 15, 10);
        figure[2] = new Triangle(15, 15, 15);
        double sumOfPerimeter = 0;
        for (int i = 0; i < figure.length; i++) {
            sumOfPerimeter = sumOfPerimeter + figure[i].perimeter();
        }
        System.out.println("= " + sumOfPerimeter);
    }
}
