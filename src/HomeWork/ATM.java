package HomeWork;

public class ATM {
    int sumAtm;
    int banknotes20;
    int banknotes50;
    int banknotes100;

    public ATM() {
        this.sumAtm = 1000;
        this.banknotes20 = 20;
        this.banknotes50 = 50;
        this.banknotes100 = 100;
    }

    void addMoney(int addMoney20, int addMoney50, int addMoney100) {
        addMoney20 = addMoney20 + banknotes20;
        addMoney50 = addMoney50 + banknotes50;
        addMoney100 = addMoney100 + banknotes100;
    }

    void giveMoney(int sum) {
        if (sum % 10 != 0) {
            System.out.println("Ошибка");
        } else {
            if (banknotes20 * 20 + banknotes50 * 50 + banknotes100 * 100 >= sum) {
                System.out.println("Операция прошла успешно");
            } else {
                System.out.println("Операция не удалась. Банкомат принимает купюры: 20 50 100");
            }
        }
    }
}
