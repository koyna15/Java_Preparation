package LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class InsertAtEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int x = 6;

        Node result = insertAtEnd(head,x);
        display(head);
    }

    public static Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                Node newNode = new Node(x);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void display(Node result){
        Node temp = result;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

}
