public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWheight = 0;
    private static double totalPriceBasket = 0;
    private static int totalCountBaskets = 0;
    private int totalItemsCount = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWheight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWheight = totalWheight;
    }


    public static int getCount() {
        return count;
    }

    public static double getTotalPriceBasket() {
        return totalPriceBasket;
    }

    public static int getTotalCountBaskets() {
        return totalCountBaskets;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    private static void increaseTotalPriceBasket(int totalPrice) {
        Basket.totalPriceBasket = Basket.totalPriceBasket + totalPrice;
    }

    private static void increaseTotalCountBaskets(int count) {
        Basket.totalCountBaskets = Basket.totalCountBaskets + count;
    }

    public void add(String name, int price, double wheight) {
        add(name, price, 1, wheight);
    }

    public void add(String name, int price, int count, double wheight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " " + "Рублей" + " - " + wheight + " мл";
        totalPrice = totalPrice + count * price;
        totalWheight = totalWheight + count * wheight;
        totalItemsCount = totalItemsCount + count;
        increaseTotalPriceBasket(price*count);
        increaseTotalCountBaskets(count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWheight = 0;
    }

    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    public double getTotalWeight() {
        return totalWheight;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public static double getAverageCount() {
        double averageCount = totalPriceBasket / totalCountBaskets;
        return averageCount;
    }

    public static double getAverageBasketPrice() {
        double averageBasketPrice = totalPriceBasket / count;
        return averageBasketPrice;
    }

}
