package Buoi_9;

class TreeNode {
    int data;
    TreeNode leftNode, rightNode;

    public TreeNode(int nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    public void insert(int value) {
        if (value < data) {
            if (leftNode == null) leftNode = new TreeNode(value);
            else leftNode.insert(value);
        } else if (value > data) {
            if (rightNode == null) rightNode = new TreeNode(value);
            else rightNode.insert(value);
        }
    }
}

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public void insertNode(int insertValue) {
        if (root == null) root = new TreeNode(insertValue);
        else root.insert(insertValue);
    }

    public void preorderTraversal() {
        preorder(root);
    }
    public void inorderTraversal() {
        inorder( root );
    }
    public void postorderTraversal() {
        postorder( root );
    }
    private void preorder( TreeNode node ) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.leftNode);
        preorder(node.rightNode);
    }
    private void inorder( TreeNode node ) {
        if (node == null) return;
        inorder(node.leftNode);
        System.out.print(node.data + " ");
        inorder(node.rightNode);
    }
    private void postorder( TreeNode node ) {
        if (node == null) return;
        postorder(node.leftNode);
        postorder(node.rightNode);
        System.out.print(node.data + " ");
    }

    public static void main( String[] args ) {
        Tree tree = new Tree();
        int value;
        for (int i = 1; i <= 10; i++) {
            value = (int) (Math.random() * 100);
            tree.insertNode(value);
        }
        System.out.println("Preorder:");
        tree.preorderTraversal();
        System.out.println("\nInorder:");
        tree.inorderTraversal();
        System.out.println("\nPostorder:");
        tree.postorderTraversal();
    }

}