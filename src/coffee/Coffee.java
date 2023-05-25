package coffee;

public abstract class Coffee {
    private String type;
    private float price;
    private String storeName;

    protected Coffee(String type, float price, String storeName) {
        this.type = type;
        this.price = price;
        this.storeName = storeName;
    }

    // protected abstract String getType();
    // protected abstract float getPrice();
    // protected abstract String getStoreName();

    // protected abstract void setType();
    // protected abstract void setPrice();
    // protected abstract void setStoreName();

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

    protected abstract void ingredient();
    protected abstract void howToMakeCoffee();
    protected abstract void prepare();
}