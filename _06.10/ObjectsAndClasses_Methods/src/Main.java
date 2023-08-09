public class Main {

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Milk", 40, 3);
        basket1.add("Tea", 30, 2);

        Basket basket2 = new Basket();
        basket2.add("Milk", 40, 3);

        basket1.print("basket1");
        System.out.println("\n");
        basket2.print("basket2");
        System.out.println("\n");

        System.out.println("Total items:");
        System.out.println(Basket.getCountAllItems());
        System.out.println("Total Price:");
        System.out.println(Basket.getTotalPriceBaskets());
    }
}
