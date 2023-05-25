package coffee;

public class DarkChocolateMocha extends Coffee {
    private static final String type = "Dark Chocolate Mocha";
    private static final double price = 6.5;
    private static final String storeName = "Starppops";
    private static final String chocolateType = "Dark Chocolate";
    private String ingredients;

    public DarkChocolateMocha(String ingredients) {
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
        System.out.println(chocolateType + ", " + ingredients);
    }

    @Override
    public void prepare() {
        System.out.println(type);
        System.out.println(ingredients);
    }
}
