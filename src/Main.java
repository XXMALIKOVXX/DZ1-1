package org.example;

public class Main {
    public static void main(String[] args) {
        int balanceRub = 100;
        int replenishmentrub = 1100;

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int bonusRub = 1000;
        int bonus = 0;

        if (bonusRub < replenishmentrub) {
            bonus = replenishmentrub / 100;
            // Условным оператором проверяете, превысила ли
            // сумма пополнения порог, и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            System.out.println("Бонусные рубли=" + bonus); // на экран.
        }
        if (bonusRub >= replenishmentrub) {
            System.out.println("Nishebrodik_idi_rabotai");
        }


    }
}
