package HomeWork8;

public class Tiger extends Animal {
    static void voice() {
        System.out.println("I'm talk RRR");
    }

    static void eat(String food) {
        if (food == "Meat" || food == "meat") {
            System.out.println("Mmm, tasty");
        } else {
            System.out.println("So bad");
        }
    }
}
