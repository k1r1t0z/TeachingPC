package HW.HomeWork9.Task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(15, 15, 15);
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(15, 10, 15, 10);
        triangle.perimeter();
        triangle.square();
        circle.perimeter();
        circle.square();
        rectangle.perimeter();
        rectangle.square();
        Figure[] figure = new Figure[3];
        figure[0] = new Circle(10);
        figure[1] = new Rectangle(15, 10, 15, 10);
        figure[2] = new Triangle(15, 15, 15);
        for (int i = 0; i < figure.length; i++) {
            if (i == 0) {
                figure[i].perimeter();
            } else if (i == 1) {
                figure[i].perimeter();
            } else if (i == 2) {
                figure[i].perimeter();
            }
        }
    }
}
