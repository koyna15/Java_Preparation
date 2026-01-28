package LinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node res = reverse(head);
        display(res);
    }
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next; //stores next value
            curr.next = prev; //reverse link
            prev = curr; //move prev
            curr = temp; //move curr
        }
        return prev;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }
}
