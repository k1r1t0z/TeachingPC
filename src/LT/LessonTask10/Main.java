package LT.LessonTask10;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Kirill", 21, 4500);
        Person clone = (Person) person.clone();

        clone.setName("Vasa");

        System.out.println(clone);
        System.out.println(person);

        System.out.println(person.equals(clone));
    }
}
