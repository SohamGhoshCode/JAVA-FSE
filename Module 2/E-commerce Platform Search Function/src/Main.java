public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "T-Shirt", "Clothing"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Watch", "Accessories")
        };

        Product[] sortedProducts = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "T-Shirt", "Clothing"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Watch", "Accessories")
        };

        int searchId = 4;

        System.out.println("Linear Search:");
        Product linearResult = SearchAlgorithms.linearSearch(products, searchId);
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("\nBinary Search:");
        Product binaryResult = SearchAlgorithms.binarySearch(sortedProducts, searchId);
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}
