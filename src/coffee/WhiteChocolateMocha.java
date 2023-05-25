package coffee;

public class WhiteChocolateMocha extends Coffee {
    private static final String type = "White Chocolate Mocha";
    private static final String chocolateType = "White Chocolate";
    private String ingredients;

    public WhiteChocolateMocha(float price, String storeName, String ingredients) {
        super(price, storeName);
        this.ingredients = ingredients;
    }

    // These override methods are the same for each derived class
    // This simply shows how overriding works

    // Functions as a setter
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
