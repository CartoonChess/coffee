package coffee;

public class WhiteChocolateMocha extends Coffee {
    private String chocolateType = "White Chocolate";

    public WhiteChocolateMocha(String type, float price, String storeName) {
        super(type, price, storeName);
    }

    @Override
    protected void ingredient() {
        // TODO: Auto-generated method stub
    }

    @Override
    protected void howToMakeCoffee() {
        // TODO: Auto-generated method stub
    }

    @Override
    public void prepare() {
        System.out.println("White Chocolate Mocha");
    }
}
