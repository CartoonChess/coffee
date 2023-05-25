package coffee;

public class PeppermintMocha extends Coffee {
    private String type = "Peppermint Mocha";
    private int peppermintSyrupAmount;

    public PeppermintMocha(float price, String storeName, int peppermintSyrupAmount) {
        super(price, storeName);
        this.peppermintSyrupAmount = peppermintSyrupAmount;
    }

    public int getPeppermintSyrupAmount() {
        return peppermintSyrupAmount;
    }

    public void setPeppermintSyrupAmount(int amount) {
        peppermintSyrupAmount = amount;
    }

    @Override
    protected void ingredient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ingredient'");
    }

    @Override
    protected void howToMakeCoffee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'howToMakeCoffee'");
    }

    @Override
    protected void prepare() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepare'");
    }
}
