package Buoi_9;

public class Queue extends DanhSach {
    public Queue() {
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public void enqueue(int value) {
        super.insertAtBack(value);
    }

    public int dequeue() {
        return super.removeFromFront();
    }

    public void print() {
        super.print();
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(2);
        q.print();
        q.dequeue();
        q.print();
    }
}
