package GfG;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        ArrayList<Integer> result = bottomView(root);
        System.out.println(result);
    }

    static ArrayList<Integer> bottomView(Node root){

        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q= new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){

            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;

            map.put(hd, node.val);

            if(node.left != null){
                q.offer(new Pair(node.left, hd - 1));
            }

            if(node.right != null){
                q.offer(new Pair(node.right, hd + 1));
            }
        }

        for(int value : map.values()){
            ans.add(value);
        }

        return ans;
    }
}