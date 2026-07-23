package GfG;

class LCAInBST {
    public static void main(String[] args) {

    }
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        Node curr = root;
        while(curr != null){
            if(n1.val < curr.val && n2.val < curr.val){
                curr = curr.left;
            }
            else if(n1.val > curr.val && n2.val > curr.val){
                curr = curr.right;
            }
            else{
                return curr;
            }
        }
        
        return null;
    }
}