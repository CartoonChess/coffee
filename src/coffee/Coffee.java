package coffee;

public abstract class Coffee {
    private String type;
    private double price;
    private String storeName;

    protected Coffee(String type, double price, String storeName) {
        this.type = type;
        this.price = price;
        this.storeName = storeName;
    }

    protected String getType() { return type; }
    protected double getPrice() { return price; }
    protected String getStoreName() { return storeName; }

    protected void setType(String type) {
        this.type = type;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
    
    protected void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    protected abstract String ingredient();
    protected abstract void howToMakeCoffee();
    protected abstract void prepare();
}