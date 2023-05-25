package coffee;

public abstract class Coffee {
    private static String type;
    private float price;
    private String storeName;

    protected Coffee(float price, String storeName) {
        this.price = price;
        this.storeName = storeName;
    }

    protected String getType() { return type; }
    protected float getPrice() { return price; }
    protected String getStoreName() { return storeName; }

    protected void setType(String type) {
        this.type = type;
    }

    protected void setPrice(float price) {
        this.price = price;
    }
    protected void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    protected abstract void ingredient(String ingredients);
    protected abstract void howToMakeCoffee();
    protected abstract void prepare();
}