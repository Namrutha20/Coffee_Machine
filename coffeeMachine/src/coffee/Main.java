package coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MoneyMachine moneyMachine = new MoneyMachine();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Menu menu = new Menu();

        Scanner sc = new Scanner(System.in);
        boolean isOn = true;

        while (isOn) {
            String options = menu.getItems();
            System.out.print("What would you like? (" + options + "): ");
            String choice = sc.nextLine();

            if (choice.equals("off")) {
                isOn = false;

            } else if (choice.equals("report")) {
                coffeeMaker.report();
                moneyMachine.report();

            } else {
                MenuItem drink = menu.findDrink(choice);

                if (drink != null) {
                    if (coffeeMaker.isResourceSufficient(drink)
                            && moneyMachine.makePayment(drink.getCost(), sc)) {

                        coffeeMaker.makeCoffee(drink);
                    }
                }
            }
        }

        sc.close();
    }
}
