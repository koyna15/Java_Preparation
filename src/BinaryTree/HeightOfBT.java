package BinaryTree;

public class HeightOfBT {
    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        root.right = new Node(18);

        int ans = height(root);
        System.out.println(ans);
    }

    static int height(Node root){
        if(root == null) return -1;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
