package LinkedList;

public class InsertAtMiddle {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node result = insertInMiddle(head, 4);
        display(result);
    }
    public static Node insertInMiddle(Node head, int x){
        Node newNode = new Node(x);
        if(head == null){
            return newNode;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;

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
