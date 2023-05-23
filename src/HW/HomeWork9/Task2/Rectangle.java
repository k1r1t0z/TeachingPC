package HW.HomeWork9.Task2;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    void square() {
        System.out.println("Square rectangle " + (sideA * sideB));
    }
}
