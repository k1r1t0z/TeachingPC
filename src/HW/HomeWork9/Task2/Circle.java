package HW.HomeWork9.Task2;

public class Circle extends Figure {
    private int circle;
    private double radius = 0;

    public Circle(int circle) {
        this.circle = circle;
    }

    public double getRadius() {
        return radius;
    }

    public int getCircle() {
        return circle;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }

    @Override
    double perimeter() {
        radius = circle / (Math.PI * 2);
        return 2 * Math.PI * radius;
    }

    @Override
    void square() {
        System.out.println("Square circle " + (Math.PI * (Math.pow(radius, 2))));
    }
}
