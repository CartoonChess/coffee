package coffee;

public class CoffeeMocha extends Coffee {
    private String type = "Coffee Mocha";

    public CoffeeMocha(float price, String storeName) {
        super(price, storeName);
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
