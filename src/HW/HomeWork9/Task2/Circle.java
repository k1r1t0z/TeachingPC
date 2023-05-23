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

    double rad() {
        radius = circle / (Math.PI * 2);
        return radius;
    }

    @Override
    double perimeter() {
        double per = 2 * Math.PI * rad();
        return per;
    }

    @Override
    void square() {
        System.out.println("Square circle " + (Math.PI * (Math.pow(rad(), 2))));
    }
}
