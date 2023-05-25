package coffee;

public class DarkChocolateMocha extends Coffee {
    private static final String type = "Dark Chocolate Mocha";
    private static final String chocolateType = "Dark Chocolate";
    private String ingredients;

    public DarkChocolateMocha(double price, String storeName, String ingredients) {
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
