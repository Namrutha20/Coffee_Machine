package coffee;

public class CoffeeMaker {

    private int water = 300;
    private int milk = 250;
    private int coffee = 100;

    public void report() {
        System.out.println("Water: " + water + "ml");
        System.out.println("Milk: " + milk + "ml");
        System.out.println("Coffee: " + coffee + "g");
    }

    public boolean isResourceSufficient(MenuItem drink) {
        if (drink.getWater() > water) {
            System.out.println("Sorry there is not enough water.");
            return false;
        }
        if (drink.getMilk() > milk) {
            System.out.println("Sorry there is not enough milk.");
            return false;
        }
        if (drink.getCoffee() > coffee) {
            System.out.println("Sorry there is not enough coffee.");
            return false;
        }
        return true;
    }

    public void makeCoffee(MenuItem order) {
        water -= order.getWater();
        milk -= order.getMilk();
        coffee -= order.getCoffee();

        System.out.println("Here is your " + order.getName() + " ☕️. Enjoy!");
    }
}
