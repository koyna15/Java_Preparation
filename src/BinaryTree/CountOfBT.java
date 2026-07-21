package BinaryTree;

public class CountOfBT {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        int ans = count(root);
        System.out.println(ans);
    }

    static int count(Node root){

        if(root == null) return 0;

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return 1 + leftCount + rightCount;
    }
}
