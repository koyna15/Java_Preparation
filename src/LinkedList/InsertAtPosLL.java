package LinkedList;

public class InsertAtPosLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node res = insertPos(head,2,5);
        display(res);
    }
    public static Node insertPos(Node head, int pos, int val) {
        Node temp = head;
        Node newNode = new Node(val);
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        //int count = 1;
        // while(temp != null && count < pos - 1){
        //     temp = temp.next;
        //     count++;
        // }
        for (int i = 1; temp != null && i < pos - 1; i++) //Second approach
        {
            temp = temp.next;
        }
        if(temp != null){
            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }
}
