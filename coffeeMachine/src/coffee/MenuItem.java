package coffee;

import java.math.BigDecimal;

public class MenuItem {
    private final String name;
    private final BigDecimal cost;
    private final Ingredients ingredients;

    public MenuItem(String name, BigDecimal cost, Ingredients ingredients) {
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
    }

    public String getName() { return name; }
    public BigDecimal getCost() { return cost; }
    public Ingredients getIngredients() { return ingredients; }
}
