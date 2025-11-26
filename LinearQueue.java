class LinearQueue {
    int front = -1, rear = -1;
    int size;
    int[] queue;

    LinearQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int ticket) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = ticket;
        System.out.println("Ticket Added: " + ticket);
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Ticket Processed: " + queue[front++]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);
        q.enqueue(101);
        q.enqueue(102);
        q.enqueue(103);
        q.display();
        q.dequeue();
        q.display();
    }
}
