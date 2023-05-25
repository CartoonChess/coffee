package coffee;

public class PeppermintMocha extends Coffee {
    private static final String type = "Peppermint Mocha";
    private int peppermintSyrupAmount = 1;
    private String ingredients;

    public PeppermintMocha(double price, String storeName, String ingredients, int peppermintSyrupAmount) {
        super(price, storeName);
        this.ingredients = ingredients;
        this.peppermintSyrupAmount = peppermintSyrupAmount;
    }

    public int getPeppermintSyrupAmount() {
        return peppermintSyrupAmount;
    }

    public void setPeppermintSyrupAmount(int amount) {
        peppermintSyrupAmount = amount;
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
