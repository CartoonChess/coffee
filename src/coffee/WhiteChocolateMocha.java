package coffee;

public class WhiteChocolateMocha extends Coffee {
    private String chocolateType = "White Chocolate";
    private String ingredients;

    public WhiteChocolateMocha(String ingredients) {
        super("White Chocolate Mocha", 6.5, "Starppops");
        this.ingredients = ingredients;
    }

    // Functions as a getter
    @Override
    protected String ingredient() {
        return ingredients;
    }

    @Override
    protected void howToMakeCoffee() {
        System.out.println("To make a " + getType() + ", use the following ingredients:");
        System.out.println(chocolateType + ", " + ingredients);
    }

    @Override
    public void prepare() {
        System.out.println(getType());
        System.out.println(ingredients);
    }
}