import model.QueueLinkedList;

public class RestaurantQueueManagement {

    static QueueLinkedList queue = new QueueLinkedList();

    public static void main(String[] args) {

        System.out.println("--- Manajemen Antrian Restoran ---");

        pushCustomer();
        popCustomer();
        queue.push("David");
        popCustomer();
    }

    public static void pushCustomer() {
        queue.push("Alice");
        queue.push("Bob");
        queue.push("Charlie");
    }

    public static void popCustomer() {
        queue.pop();
        queue.pop();
    }
}