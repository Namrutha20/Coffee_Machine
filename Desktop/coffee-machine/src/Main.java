//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        CoffeeMaker maker = new CoffeeMaker();
        MoneyMachine money = new MoneyMachine();

        boolean isOn = true;

        while (isOn) {
            System.out.print("What would you like? (" + menu.getItemsString() + "): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("off")) {
                isOn = false;
            }
            else if (choice.equalsIgnoreCase("report")) {
                Ingredients r = maker.getResources();
                System.out.println("\n--- MACHINE REPORT ---");
                System.out.println("Water: " + r.getWater());
                System.out.println("Milk: " + r.getMilk());
                System.out.println("Coffee: " + r.getCoffee());
                System.out.println("Profit: $" + money.getProfit());
                System.out.println("----------------------\n");
            }
            else if (choice.equalsIgnoreCase("refill")) {
                System.out.println("Refill resources...");
                System.out.print("Add water: ");
                int w = Integer.parseInt(sc.nextLine());
                System.out.print("Add milk: ");
                int m = Integer.parseInt(sc.nextLine());
                System.out.print("Add coffee: ");
                int c = Integer.parseInt(sc.nextLine());

                maker.refill(new Ingredients(w, m, c));
                System.out.println("Resources refilled!\n");
            }
            else {
                MenuItem item = menu.findDrink(choice);
                if (item == null) {
                    System.out.println("Invalid option\n");
                    continue;
                }

                if (!maker.isResourceSufficient(item)) {
                    System.out.println("Not enough resources\n");
                    continue;
                }

                if (money.makePayment(item.getCost(), sc)) {
                    maker.makeCoffee(item);
                    System.out.println("Here is your " + item.getName() + " ☕\n");
                }
            }
        }
        sc.close();
    }
}
