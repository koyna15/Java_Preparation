package LinkedList;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    static class LL{
        Node head;
        Node tail;

        LL(){
            head=null;
            tail=null;
        }

        void insertAtHead(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        void insertAtTail(int data){
            Node newNode = new Node(data);
            if(tail==null){
                head=newNode;
                tail=newNode;
                return;
            }
            tail.next= newNode;
            tail=newNode;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +"->");
                temp=temp.next;
            }
            //System.out.println();
        }
    }

    public static void main(String[] args) {
        LL list= new LL();
//        list.insertAtHead(10);
//        list.insertAtHead(20);
//        list.insertAtHead(30);
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
    }
}
