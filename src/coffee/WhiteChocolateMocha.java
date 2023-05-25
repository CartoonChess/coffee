package coffee;

public class WhiteChocolateMocha extends Coffee {
    private String type = "White Chocolate Mocha";
    private String chocolateType = "White Chocolate";

    public WhiteChocolateMocha(float price, String storeName) {
        super(price, storeName);
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
