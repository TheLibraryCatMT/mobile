public class Main {
    public static void main(String[] args) {
        int wallet = 200; // сумма денег на счете
        int refill = 1200; // сумма пополнения
        int bonus;

        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int walletPlusBonus = wallet + bonus + refill;

        System.out.println("Вы пополнили баланс на " + refill + " рублей.");
        System.out.println("Ваш бонус составил " + bonus + " рублей.");
        System.out.println("Баланс вашего счета: " + walletPlusBonus + "рублей.");

    }
}
