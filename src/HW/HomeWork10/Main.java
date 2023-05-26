package HW.HomeWork10;

public class Main {
    public static void main(String[] args) {
        User user = new User(21, "Kirill", 'm');
        User user2 = new User(21, "Kirill", 'm');
        User user3 = new User(20, "Kirill", 'm');
        System.out.println(user.equals(user2));
        System.out.println(user.equals(user3));
    }
}
