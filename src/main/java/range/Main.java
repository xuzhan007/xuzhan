package range;

public class Main {
    static class Node {
        double comparable;
        Node next;
    }

    private Node addNode(Node head, double d) {
        Node node = new Node();
        node.comparable = d;
        node.next = head;
        head = node;
        return head;
    }

    private Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node h1 = null;
        Node h2 = null;
        Node splitBy = head;
        head = head.next;
        splitBy.next = null;

        Node p = null;
        while (head != null) {
            p = head;
            head = head.next;
            if (p.comparable < splitBy.comparable) {
                p.next = h1;
                h1 = p;
            } else {
                p.next = h2;
                h2 = p;
            }
        }

        h1 = quickSort(h1);
        h2 = quickSort(h2);

        if (h1 != null) {
            p = h1;
            while (p.next != null) {
                p = p.next;
            }
            p.next = splitBy;
            splitBy.next = h2;
        } else {
            splitBy.next = h2;
            h1 = splitBy;
        }

        return h1;
    }

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        Node head = null;
        head = main.addNode(head, -2.7);
        head = main.addNode(head, 1.5);
        head = main.addNode(head, 7);
        head = main.addNode(head, 0);
        head = main.addNode(head, 3);
        head = main.addNode(head, 1);
        head = main.addNode(head, 4);
        head = main.addNode(head, 2);

        head = main.quickSort(head);

        return;
    }
}