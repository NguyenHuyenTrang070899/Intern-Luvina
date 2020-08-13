package Buoi_9;

public class Stack extends DanhSach{
    public Stack() {}
    public boolean isEmpty() {
        return super.isEmpty();
    }
    public void push(int value) {
        super.insertAtFront(value);
    }
    public int pop() {
        return super.removeFromFront();
    }
    public void print() {
        super.print();
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(3);
        s.push(2);
        s.print();
        s.pop();
        s.print();
    }
}