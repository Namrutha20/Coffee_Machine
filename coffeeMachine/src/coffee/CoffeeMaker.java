public class CoffeeMaker {

    private Ingredients resources = new Ingredients(1000, 800, 500);

    public boolean isResourceSufficient(MenuItem drink) {
        return resources.isEnough(drink.getIngredients());
    }

    public void makeCoffee(MenuItem drink) {
        resources.deduct(drink.getIngredients());
    }

    public Ingredients getResources() {
        return resources;
    }

    public void refill(Ingredients additional) {
        resources.add(additional);
    }
}
