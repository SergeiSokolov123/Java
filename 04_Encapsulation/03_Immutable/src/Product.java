public class Product {
    private final String name;
    private int price;
    private final byte barCode;

    public Product(String name, byte barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public byte getBarCode() {
        return barCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
