package HW.HomeWork10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User(21, "Kirill", 'M');
        User[] cloneUser = new User[0];
        String allUser = Arrays.toString(cloneUser);
        cloneUser = new User[5];
        for (int i = 0; i < cloneUser.length; i++) {
            System.out.println(user);
        }
        System.out.println(user.equals(allUser));
    }
}
