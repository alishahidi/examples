import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = new Node(1);
    }

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            int count = 1;
            int middle = getMiddle();
            while (current.next != null && count < middle) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int getMiddle() {
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.data;
    }

    public void printList() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        System.out.println(sb.toString().trim());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine(); // Read the newline character after q
        LinkedList ll = new LinkedList();

        for (int i = 0; i < q; i++) {
            String request = scanner.nextLine().trim().toLowerCase();
            if (request.equals("front")) {
                ll.addFront(ll.head.data + 1);
            } else if (request.equals("end")) {
                ll.addEnd(ll.head.data + 1);
            } else if (request.equals("center")) {
                ll.addMiddle(ll.head.data + 1);
            }
        }

        ll.printList();
        scanner.close();
    }
}
