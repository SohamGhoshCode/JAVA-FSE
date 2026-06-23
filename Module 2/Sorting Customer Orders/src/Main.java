public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.00),
            new Order(2, "Bob", 89.99),
            new Order(3, "Charlie", 540.50),
            new Order(4, "Diana", 120.00),
            new Order(5, "Eve", 310.75)
        };

        Order[] bubbleOrders = orders.clone();
        BubbleSort.sort(bubbleOrders);
        System.out.println("Bubble Sort:");
        for (Order o : bubbleOrders) System.out.println(o);

        Order[] quickOrders = orders.clone();
        QuickSort.sort(quickOrders, 0, quickOrders.length - 1);
        System.out.println("\nQuick Sort:");
        for (Order o : quickOrders) System.out.println(o);
    }
}
