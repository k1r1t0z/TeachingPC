package HW.HomeWork8;

public class Dog extends Animal {
    private Dog() {

    }

    static void voice() {
        System.out.println("I'm talk woof woof");
    }

    static void eat(String food) {
        if (food == "Meat" || food == "meat") {
            System.out.println("Mmm, tasty");
        } else {
            System.out.println("I'm don't eat this");
        }
    }
}
