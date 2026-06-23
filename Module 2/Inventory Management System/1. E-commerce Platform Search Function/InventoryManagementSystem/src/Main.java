public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(1, "Laptop", 50, 75000.00);
        Product p2 = new Product(2, "Mouse", 200, 499.00);
        Product p3 = new Product(3, "Keyboard", 150, 999.00);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("All Products:");
        inventory.displayAllProducts();

        System.out.println("\nUpdating Product with ID 2...");
        inventory.updateProduct(2, "Wireless Mouse", 180, 799.00);
        inventory.displayAllProducts();

        System.out.println("\nDeleting Product with ID 3...");
        inventory.deleteProduct(3);
        inventory.displayAllProducts();
    }
}
