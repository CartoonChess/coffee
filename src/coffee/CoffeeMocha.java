package coffee;

public class CoffeeMocha extends Coffee {
    private String ingredients;

    public CoffeeMocha(String ingredients) {
        super("Coffee Mocha", 4.0, "Starppops");
        this.ingredients = ingredients;
    }

    @Override
    protected String ingredient() {
        return ingredients;
    }

    @Override
    protected void howToMakeCoffee() {
        System.out.println("To make a " + getType() + ", use the following ingredients:");
        System.out.println(ingredients);
    }

    @Override
    public void prepare() {
        System.out.println(getType());
        System.out.println(ingredients);
    }
}
