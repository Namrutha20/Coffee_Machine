import java.math.BigDecimal;

public class Ingredients {
    private int water;
    private int milk;
    private int coffee;

    public Ingredients(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    public int getWater() { return water; }
    public int getMilk() { return milk; }
    public int getCoffee() { return coffee; }

    public void deduct(Ingredients required) {
        this.water -= required.water;
        this.milk -= required.milk;
        this.coffee -= required.coffee;
    }

    public boolean isEnough(Ingredients required) {
        return water >= required.water &&
                milk >= required.milk &&
                coffee >= required.coffee;
    }

    public void add(Ingredients extra) {
        this.water += extra.water;
        this.milk += extra.milk;
        this.coffee += extra.coffee;
    }
}
