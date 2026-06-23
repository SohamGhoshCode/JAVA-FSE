public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Clean Code", "Robert C. Martin"),
            new Book(2, "Design Patterns", "Gang of Four"),
            new Book(3, "Effective Java", "Joshua Bloch"),
            new Book(4, "Refactoring", "Martin Fowler"),
            new Book(5, "The Pragmatic Programmer", "Andrew Hunt")
        };

        System.out.println("Linear Search:");
        Book found = BookSearch.linearSearch(books, "Effective Java");
        System.out.println(found);

        System.out.println("\nBinary Search:");
        Book bFound = BookSearch.binarySearch(books, "Effective Java");
        System.out.println(bFound);
    }
}
