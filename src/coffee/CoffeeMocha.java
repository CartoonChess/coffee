package coffee;

public class CoffeeMocha extends Coffee {
    private static final String type = "Coffee Mocha";
    private String ingredients;

    public CoffeeMocha(float price, String storeName, String ingredients) {
        super(price, storeName);
        this.ingredients = ingredients;
    }

    @Override
    protected void ingredient(String ingredients) {
        this.ingredients = ingredients;
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
