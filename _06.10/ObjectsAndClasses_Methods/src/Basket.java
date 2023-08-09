public class Basket {

    private int countItemsBasket = 0;
    private String itemsBasket = "";
    private int totalPriceBasket = 0;
    private int limit;
    private double totalWeight = 0;

    // static variables
    private static int CountAllItemsOfBaskets = 0;
    private static int totalPriceAllItems = 0;

    public Basket() {
        itemsBasket = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String itemsBasket, int totalPriceBasket) {
        this();
        this.itemsBasket = this.itemsBasket + itemsBasket;
        this.totalPriceBasket = totalPriceBasket;
    }

    public int getCountItemsBasket() {
        return countItemsBasket;
    }

    public void increaseCountItemsBasket() {
        increaseCountItemsBasket(1);
        increaseCountAllItems(1);
    }

    public void increaseCountItemsBasket(int countItemsBasket) {
        this.countItemsBasket += countItemsBasket;
        increaseCountAllItems(countItemsBasket);
    }

    public void add(String name, int price) {
        add(name, price, 1, 50.0);
    }

    public void add(String name, int price, int countItemsBasket) {
        add(name, price, countItemsBasket, 50.0);
    }

    public void add(String name, int price, int countItemsBasket, double weight) {
        increaseTotalPriceBaskets(price*countItemsBasket);
        increaseCountItemsBasket(countItemsBasket);

        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPriceBasket + countItemsBasket * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        itemsBasket = itemsBasket + "\n" + name + " - " +
            countItemsBasket + " шт. " + "(" + weight * countItemsBasket + " кг) - " + countItemsBasket * price;
        totalPriceBasket = totalPriceBasket + countItemsBasket * price;
        totalWeight = totalWeight + countItemsBasket * weight;
    }

    public void clear() {
        itemsBasket = "";
        totalPriceBasket = 0;
    }

    public int getTotalPriceBasket() {
        return totalPriceBasket;
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return itemsBasket.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (itemsBasket.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(itemsBasket);
        }
    }

    // static methods
    public static int getCountAllItems() {
        return Basket.CountAllItemsOfBaskets;
    }

    private static void increaseCountAllItems() {
        increaseCountAllItems(1);
    }

    private static void increaseCountAllItems(int count) {
        Basket.CountAllItemsOfBaskets += count;
    }

    public static int getTotalPriceBaskets() {
        return Basket.totalPriceAllItems;
    }

    private static void increaseTotalPriceBaskets(int price) {
        Basket.totalPriceAllItems += price;
    }

    public static int getAveragePriceAllItems() {
        return Basket.totalPriceAllItems / Basket.CountAllItemsOfBaskets;
    }

    public static int getAveragePriceBasket(Basket basket) {
        int totalPrice = basket.getTotalPriceBasket();
        int countItems = basket.getCountItemsBasket();

        return totalPrice / countItems;
    }
}
