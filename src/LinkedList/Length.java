package LinkedList;

public class Length {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        LengthOfLL obj = new LengthOfLL();
        int ans = obj.getCount(head);
        System.out.println(ans);
        int ans1 = obj.getCount1(head);
        System.out.println(ans1);
    }
}
class LengthOfLL{
    public int getCount(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int getCount1(Node head){
        Node temp = head;
        int count = 1;
        while(temp.next != null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
