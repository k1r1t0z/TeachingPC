package HW.HomeWork9.Task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(15, 15, 15);
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(15, 10, 15, 10);
        triangle.square();
        double perimeterTriangle = triangle.perimeter();
        circle.square();
        double perimeterCircle = circle.perimeter();
        rectangle.square();
        double perimeterRectangle = rectangle.perimeter();
        Figure[] figure = new Figure[3];
        figure[0] = new Circle(10);
        figure[1] = new Rectangle(15, 10, 15, 10);
        figure[2] = new Triangle(15, 15, 15);
        double sumOfPerimeter = 0;
        for (int i = 0; i < figure.length; i++) {
            sumOfPerimeter = sumOfPerimeter + figure[i].perimeter();
        }
        System.out.println("Сумма перимтера фигур " + sumOfPerimeter);
    }
}
