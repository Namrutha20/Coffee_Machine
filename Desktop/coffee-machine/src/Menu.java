import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items = new ArrayList<>();

    public Menu() {
        items.add(new MenuItem("espresso", new BigDecimal("1.50"),
                new Ingredients(50, 0, 18)));

        items.add(new MenuItem("latte", new BigDecimal("2.50"),
                new Ingredients(200, 150, 24)));

        items.add(new MenuItem("cappuccino", new BigDecimal("3.00"),
                new Ingredients(250, 50, 24)));
    }

    public String getItemsString() {
        StringBuilder sb = new StringBuilder();
        for (MenuItem item : items) {
            sb.append(item.getName()).append("/");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public MenuItem findDrink(String name) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
