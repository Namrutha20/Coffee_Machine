package coffee;

public class MenuItem {

    private String name;
    private double cost;
    private int water;
    private int milk;
    private int coffee;

    public MenuItem(String name, int water, int milk, int coffee, double cost) {
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }
}
