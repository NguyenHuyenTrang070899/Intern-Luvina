package Buoi_9;

public class insert{
    public static void main(String []args){
        DanhSach list = new DanhSach();
        list.insertSort(2);
        list.insertSort(4);
        list.insertSort(9);
        list.insertSort(3);
        list.insertSort(0);
        list.insertSort(1);
        list.insertSort(7);
        list.print();
    }
}
class Node {
    private int data;
    private Node next;
    public Node(int value) {
        this(value, null);
    }
    public Node(int value, Node next) {
        this.data = value; this.next = next;
    }
    public int getData() {return data;}
    public Node getNext() {return next;}
    public void setNext(Node next) { this.next = next;}
}
class DanhSach {
    private Node first;
    private Node last;
    public DanhSach() {
        this.first = null;
        this.last = null;
    }
    public void print() {
        Node current = first;
        while(current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return this.first == null;
    }

    public void insertAtFront(int value) {
        if(isEmpty()) {
            first = last = new Node(value);
        }
        else {
            first = new Node(value, first);
        }
    }
    public void insertAtBack(int value) {
        if(isEmpty()) {
            first = last = new Node(value);
        }
        else {
            last.setNext(new Node(value));
            last = last.getNext();
        }
    }

    public void insertSort(int value) {
        if(isEmpty())
            first = last = new Node(value);
        else {
            if (value < first.getData())
                first = new Node(value, first);
            else {
                Node current = first;
                while (current.getNext() != null) {
                    if(current.getNext().getData() < value)
                        current = current.getNext();
                    else
                        break;
                }
                if(current.getNext() == null) {
                    last.setNext(new Node(value));
                    last = last.getNext();
                }
                else {
                    current.setNext(new Node(value, current.getNext()));
                }
            }
        }
    }

    public int removeFromFront() {
        int removeItem = -1;
        if(!isEmpty()) {
            removeItem = first.getData();
            if(first == last) {
                first = null;
                last = null;
            }
            else {
                first = first.getNext();
            }
        }
        return removeItem;
    }
    public int removeFromBack() {
        int removeItem = -1;
        if(!isEmpty()) {
            removeItem = last.getData();
            if(first == last) {
                first = null;
                last = null;
            }
            else {
                Node tmp = first;
                while(tmp.getNext() != last) {
                    tmp = tmp.getNext();
                }
                last = tmp;
                last.setNext(null);
            }
        }
        return removeItem;
    }
}
