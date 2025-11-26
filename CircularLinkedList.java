class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node last = null;

    void insert(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    void delete(int key) {
        if (last == null) return;

        Node curr = last.next, prev = last;

        while (curr.data != key) {
            if (curr == last) return;
            prev = curr;
            curr = curr.next;
        }

        if (curr == last && curr.next == last) {
            last = null;
            return;
        }

        if (curr == last) last = prev;
        prev.next = curr.next;
    }

    void search(int key) {
        if (last == null) {
            System.out.println("List Empty");
            return;
        }
        Node temp = last.next;
        do {
            if (temp.data == key) {
                System.out.println("Found: " + key);
                return;
            }
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("Not Found");
    }

    void display() {
        if (last == null) {
            System.out.println("List Empty");
            return;
        }
        Node temp = last.next;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.insert(10);
        c.insert(20);
        c.insert(30);
        c.display();
        c.search(20);
        c.delete(20);
        c.display();
    }
}
