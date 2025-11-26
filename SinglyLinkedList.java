class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void delete(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;

        prev.next = temp.next;
    }

    void search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found: " + key);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.display();
        s.search(20);
        s.delete(20);
        s.display();
    }
}
