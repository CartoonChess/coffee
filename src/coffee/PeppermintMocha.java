package coffee;

public class PeppermintMocha extends Coffee {
    private String ingredients;
    private int peppermintSyrupAmount;

    public PeppermintMocha(String ingredients, int peppermintSyrupAmount) {
        super("Peppermint Mocha", 6.0, "Starppops");
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
        System.out.println("To make a " + getType() + ", use the following ingredients:");
        System.out.println(peppermintSyrupAmount + "pump(s) of peppermint syrup, " + ingredients);
    }

    @Override
    public void prepare() {
        System.out.println(getType());
        System.out.println(ingredients);
    }
}
