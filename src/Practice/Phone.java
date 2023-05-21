package Practice;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }

    void phoneNumber (long num) {
        System.out.println(num);
    }

    void receiveCall (String name, long num) {
        System.out.println("Вам звонит " + name + "\n" + num);
    }

    void sendMessage (long num1, long num2, long num3) {
        System.out.println("Как дела?" + " Отпралено этим номерам " + num1 +  " " + num2 +  " " + num3);
    }
}
