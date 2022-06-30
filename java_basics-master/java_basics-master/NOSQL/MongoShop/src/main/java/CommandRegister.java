public interface CommandRegister {

    void addStore(String name);

    void addProduct(String name, double price);

    void displayTheProductInTheStore(String nameProduct, String nameStore);

    void getProductStatistics();

}
