public class Main {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement(10);

        em.add(new Employee(1, "Alice", "Engineer", 75000));
        em.add(new Employee(2, "Bob", "Manager", 90000));
        em.add(new Employee(3, "Charlie", "Analyst", 60000));

        System.out.println("All Employees:");
        em.traverse();

        System.out.println("\nSearch Employee ID 2:");
        System.out.println(em.search(2));

        em.delete(2);
        System.out.println("\nAfter Deleting Employee ID 2:");
        em.traverse();
    }
}
