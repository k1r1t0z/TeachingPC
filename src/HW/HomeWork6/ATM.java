package HW.HomeWork6;

public class ATM {
    int sumAtm;
    int banknotes20;
    int banknotes50;
    int banknotes100;
    int num20;
    int num50;
    int num100;

    public ATM() {
        this.sumAtm = 1000;
        this.banknotes20 = 20;
        this.banknotes50 = 50;
        this.banknotes100 = 100;
        this.num20 = 100;
        this.num50 = 100;
        this.num100 = 100;
    }

    void addMoneyInAtm(int addMoney20, int addMoney50, int addMoney100) {
        addMoney20 = addMoney20 + num20;
        addMoney50 = addMoney50 + num50;
        addMoney100 = addMoney100 + num100;
    }

    void giveMoney(int sum) {
        if (sum % 10 != 0) {
            System.out.println("Введите корректную сумму");
        } else {
            if (num20 * 20 + num50 * 50 + num100 * 100 >= sum && sum <= sumAtm) {
                System.out.println("Операция прошла успешно");
            } else {
                System.out.println("Операция не удалась");
            }
        }
    }
}
