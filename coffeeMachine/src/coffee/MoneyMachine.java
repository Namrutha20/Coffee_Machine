package coffee;

import java.math.BigDecimal;
import java.util.Scanner;

public class MoneyMachine {

    private BigDecimal profit = BigDecimal.ZERO;

    public boolean makePayment(BigDecimal cost, Scanner sc) {
        System.out.println("Insert money:");
        System.out.print("Enter amount: ");

        BigDecimal inserted;

        try {
            inserted = new BigDecimal(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid amount.");
            return false;
        }

        if (inserted.compareTo(cost) < 0) {
            System.out.println("Sorry, insufficient amount. Refunding...");
            return false;
        }

        BigDecimal change = inserted.subtract(cost);
        System.out.println("Transaction successful!");
        System.out.println("Your change: $" + change);

        profit = profit.add(cost);
        return true;
    }

    public BigDecimal getProfit() {
        return profit;
    }
}
