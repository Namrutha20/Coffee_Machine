package coffee;

import java.util.Scanner;

public class MoneyMachine {

    private final String CURRENCY = "$";
    private double profit = 0;
    private double moneyReceived = 0;

    public void report() {
        System.out.println("Money: " + CURRENCY + profit);
    }

    public double processCoins(Scanner sc) {
        moneyReceived = 0;
        System.out.println("Please insert coins.");

        System.out.print("How many quarters?: ");
        moneyReceived += sc.nextInt() * 0.25;

        System.out.print("How many dimes?: ");
        moneyReceived += sc.nextInt() * 0.10;

        System.out.print("How many nickles?: ");
        moneyReceived += sc.nextInt() * 0.05;

        System.out.print("How many pennies?: ");
        moneyReceived += sc.nextInt() * 0.01;

        sc.nextLine(); // clear newline
        return moneyReceived;
    }

    public boolean makePayment(double cost, Scanner sc) {
        processCoins(sc);

        if (moneyReceived >= cost) {
            double change = Math.round((moneyReceived - cost) * 100.0) / 100.0;
            System.out.println("Here is " + CURRENCY + change + " in change.");
            profit += cost;
            moneyReceived = 0;
            return true;
        } else {
            System.out.println("Sorry that's not enough money. Money refunded.");
            moneyReceived = 0;
            return false;
        }
    }
}
