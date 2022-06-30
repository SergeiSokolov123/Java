public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 500.1);
        basket.print("Milk");
        Basket basket1 = new Basket();
        basket1.add("Bread", 20, 200.3);
        basket1.print("Bread");
        System.out.println(Basket.getAverageCount());
        System.out.println(Basket.getAverageBasketPrice());
    }

}

