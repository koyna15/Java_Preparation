package BinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);

        levelOrder(root);

        System.out.println();

        ArrayList<Integer> ans = levelOrder1(root);
        System.out.println(ans);
    }

    static void levelOrder(Node root){

        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            Node curr = q.poll();
            System.out.print(curr.val +" ");

            if(curr.left != null){
                q.offer(curr.left);
            }
            if(curr.right != null){
                q.offer(curr.right);
            }
        }
    }

    //return type arraylist
    public static ArrayList<Integer> levelOrder1(Node root) {
        // code here
        if(root == null) return new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.offer(root);

        while(!q.isEmpty()){

            Node curr = q.poll();

            ans.add(curr.val);

            if(curr.left != null){
                q.offer(curr.left);
            }

            if(curr.right != null) q.offer(curr.right);
        }

        return ans;
    }
}
