package GfG;

public class FloorInBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(11);
        root.right.right = new Node(16);

        int ans = findMaxFork(root, 17);
        System.out.println(ans);
    }

    static int findMaxFork(Node root, int k){
        int ans = -1;
        while(root != null){
            if(root.val <= k){
                ans = root.val;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return ans;
    }
}
