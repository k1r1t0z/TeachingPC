package Practice;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(375257689324l, "Iphone 13", 113.3);
        phone.receiveCall("Kiritoz", 375299875642l);
        phone.sendMessage(375294356784l,375331234254l,375256498765l);
    }
}
