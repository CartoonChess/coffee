package coffee;

public class DarkChocolateMocha extends Coffee {
    private String chocolateType = "Dark Chocolate";

    public DarkChocolateMocha(String type, float price, String storeName) {
        super(type, price, storeName);
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