package model;

public class QueueLinkedList {
    private Node head;
    private Node tail;

    public QueueLinkedList() {
        this.head = null;
        this.tail = null;
    }


    public void push(String customerName) {
        Node newNode = new Node(customerName);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Pelanggan '" + customerName + "' ditambahkan ke antrian.");
        displayQueue();
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada pelanggan untuk dilayani.");
            return null;
        }
        String servedCustomer = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        System.out.println("Pelanggan '" + servedCustomer + "' dilayani dari antrian.");
        displayQueue();
        return servedCustomer;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini: Kosong");
            return;
        }
        System.out.print("Antrian saat ini: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}