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
        int[] array = {15, 55, 10, 40, 67};
        int sumOfPerimeter = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfPerimeter = sumOfPerimeter + array[i];
        }
        System.out.println("The sum of the perimeters of all shapes = " + sumOfPerimeter);
    }
}
