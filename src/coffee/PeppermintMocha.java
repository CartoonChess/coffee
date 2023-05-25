package coffee;

public class PeppermintMocha extends Coffee {
    private static final String type = "Peppermint Mocha";
    private static final double price = 6.0;
    private static final String storeName = "Starppops";
    private int peppermintSyrupAmount;
    private String ingredients;

    public PeppermintMocha(String ingredients, int peppermintSyrupAmount) {
        super(type, price, storeName);
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
    protected String ingredient() {
        return ingredients;
    }

    @Override
    protected void howToMakeCoffee() {
        System.out.println("To make a " + type + ", use the following ingredients:");
        System.out.println(peppermintSyrupAmount + "pump(s) of peppermint syrup, " + ingredients);
    }

    @Override
    public void prepare() {
        System.out.println(type);
        System.out.println(ingredients);
    }
}
