package Buoi_8;

public class Node {
    private int data;
    private Node next;
    public Node(int value) {
        this(value, null);
    }
    public Node(int value, Node next) {
        this.data = value;
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
class DanhSach {
    private Node first;
    private Node last;
    public DanhSach() {
        this.first = null;
        this.last = null;
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
    public int removeFromFront() {
        int removeItem = -1;
        if(!isEmpty()) {
            removeItem = first.getData();
            if(first == last) {
                first = null; last = null;
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
                first = null; last = null;
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
    public void print() {
        Node tmp = first;
        while(tmp != null) {
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}
class Stack {
    private DanhSach stackList;
    public Stack() {
        stackList = new DanhSach();
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
    public void push(int value) {
        stackList.insertAtFront(value);
    }
    public int pop() {
        return stackList.removeFromFront();
    }
    public void print() {
        stackList.print();
    }
}
class Queue {
    private DanhSach queueList;
    public Queue() {
        queueList = new DanhSach();
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public void enqueue(int value) {
        queueList.insertAtBack(value);
    }
    public int dequeue() {
        return queueList.removeFromFront();
    }
    public void print() {
        queueList.print();
    }
}
class TreeNode {
    private int data;
    private TreeNode leftNode, rightNode;
    public TreeNode(int data) {
        this.data = data;
        leftNode = rightNode = null;
    }
    public void insert(int insertData) {
        if(insertData < data) {
            if(leftNode == null) {
                leftNode = new TreeNode(insertData);
            }
            else {
                leftNode.insert(insertData);
            }
        }
        else {
            if(rightNode == null) {
                rightNode = new TreeNode(insertData);
            }
            else {
                rightNode.insert(insertData);
            }
        }
    }
    public int getData() {
        return data;
    }
    public TreeNode getLeftNode() {
        return leftNode;
    }
    public TreeNode getRightNode() {
        return rightNode;
    }
}
class Tree {
    private TreeNode root;
    public Tree() {
        root = null;
    }
    public void insertNode(int insertData) {
        if(root == null) {
            root = new TreeNode(insertData);
        }
        else {
            root.insert(insertData);
        }
    }
    public void preorderTraversal() {
        preorder(root);
    }
    private void preorder(TreeNode node) {
        if(node == null) return;
        System.out.print(node.getData() + " ");
        preorder(node.getLeftNode());
        preorder(node.getRightNode());
    }
    public void inorderTraversal() {
        inorder(root);
    }
    public void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.getLeftNode());
        System.out.print(node.getData() + " ");
        inorder(node.getRightNode());
    }
    public void postorderTraversal() {
        postorder(root);
    }
    public void postorder(TreeNode node) {
        if(node == null) return;
        postorder(node.getLeftNode());
        postorder(node.getRightNode());
        System.out.print(node.getData() + " ");
    }
    public TreeNode searchTree(int value) {
        if(root == null) {
            return null;
        }
        else {
            return search(root, value);
        }
    }
    public TreeNode search(TreeNode node, int value) {
        if(node == null) {
            return null;
        }
        else {
            if(node.getData() == value) {
                return node;
            }
            else if(node.getData() < value) {
                return search(node.getLeftNode(), value);
            }
            else {
                return search(node.getRightNode(), value);
            }
        }
    }
}
