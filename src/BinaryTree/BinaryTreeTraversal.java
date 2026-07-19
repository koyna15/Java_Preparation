package BinaryTree;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        List<Integer> result = new ArrayList<>();
        preorder1(root, result);
        System.out.println(result);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
    }

    public static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void preorder1(TreeNode root, List<Integer> result){
        if(root == null) return;
        result.add(root.val);
        preorder1(root.left,result);
        preorder1(root.right,result);
    }

    public static void inorder(TreeNode root){
        if(root == null ) return;

        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }

    public static void postorder(TreeNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val +" ");
    }

}
