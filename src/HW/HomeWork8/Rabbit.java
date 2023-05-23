package HW.HomeWork8;

public class Rabbit extends Animal {
    static void voice() {
        System.out.println("I'm talk sa sa");
    }

    static void eat(String food) {
        if (food == "Grass" || food == "grass") {
            System.out.println("Mmm, tasty");
        } else {
            System.out.println("This food don't tasty");
        }
    }
}
