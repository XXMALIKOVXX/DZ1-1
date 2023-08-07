package org.example;

public class Main {
    public static void main(String[] args) {
        int BalanceRub = 100;
        int ReplenishmentRub = 1100;

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int BonusRub = 1000;
        int Bonus = 0;

        if (BonusRub < ReplenishmentRub) {
            Bonus = ReplenishmentRub / 100;
            // Условным оператором проверяете, превысила ли
            // сумма пополнения порог, и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            System.out.println("Бонусные рубли=" + Bonus); // на экран.
        }
        if (BonusRub > ReplenishmentRub) {
            System.out.println("Nishebrodik_idi_rabotai");
        }


    }
}