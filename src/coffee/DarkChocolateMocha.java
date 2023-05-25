package coffee;

public class DarkChocolateMocha extends Coffee {
    private String chocolateType = "Dark Chocolate";
    private String ingredients;

    public DarkChocolateMocha(String ingredients) {
        super("Dark Chocolate Mocha", 6.5, "Starppops");
        this.ingredients = ingredients;
    }

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
