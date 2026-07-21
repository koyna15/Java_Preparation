package BinaryTree;

public class LCA {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.left.left = new Node(8);
        root.right.right = new Node(7);

        Node ans = lca(root, 7, 8);
        System.out.println(ans.val);
    }
    static Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null || root.val == n1 || root.val == n2){
            return root;

        }
        Node left = lca(root.left,n1,n2);
        Node right = lca(root.right,n1,n2);

        if(left == null) return right;
        if(right == null) return left;

        return root;
    }
}
