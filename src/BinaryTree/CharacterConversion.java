package BinaryTree;

public class CharacterConversion {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(97);
        root.left = new TreeNode(98);
        root.right = new TreeNode(99);
        root.left.left = new TreeNode(100);
        root.left.right = new TreeNode(101);

        preorder(root);
    }

    public static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(characterConversion(root.val) + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static char characterConversion(int n){
        char c = (char) n;
        return c;
    }
}
