package coffee;

public class CoffeeMocha extends Coffee {
    private static final String type = "Coffee Mocha";
    private static final double price = 4.0;
    private static final String storeName = "Starppops";
    private String ingredients;

    public CoffeeMocha(String ingredients) {
        super(type, price, storeName);
        this.ingredients = ingredients;
    }

    @Override
    protected String ingredient() {
        return ingredients;
    }

    @Override
    protected void howToMakeCoffee() {
        System.out.println("To make a " + type + ", use the following ingredients:");
        System.out.println(ingredients);
    }

    @Override
    public void prepare() {
        System.out.println(type);
        System.out.println(ingredients);
    }
}
