package LinkedList;

public class SearchInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        boolean result = searchKey(head,4);
        System.out.println(result);
        display(head);
    }
    public static boolean searchKey(Node head, int key){
        if(head == null){
            return false;
        }
        while(head != null){
            if(head.data == key){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }
}