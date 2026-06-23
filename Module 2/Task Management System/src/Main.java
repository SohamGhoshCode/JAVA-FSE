public class Main {
    public static void main(String[] args) {
        TaskLinkedList list = new TaskLinkedList();

        list.add(new Task(1, "Design UI", "Pending"));
        list.add(new Task(2, "Develop API", "In Progress"));
        list.add(new Task(3, "Write Tests", "Pending"));

        System.out.println("All Tasks:");
        list.traverse();

        System.out.println("\nSearch Task ID 2:");
        System.out.println(list.search(2));

        list.delete(2);
        System.out.println("\nAfter Deleting Task ID 2:");
        list.traverse();
    }
}
