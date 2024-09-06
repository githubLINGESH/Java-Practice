import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList{
    Node head;
    Node tail;

    void create(){
        Scanner s = new Scanner(System.in);


        System.out.println("Enter data for new node:");
        int d = s.nextInt();
        Node newN = new Node(d);
        newN.data = d;

        if(head==null){
            head = tail = newN;
        }
        else {
            newN.prev = tail;
            newN.next = newN;
            tail = newN;
        }
    }

    int insertAtBeg(int d){
        Node newN = new Node(d);

        if(head==null){
            System.in.out("First create");
            create();
        }
        else{
            newN.prev = null;
            newN.next = head;
            head.prev = newN;
            head = newN;
        }
    }

    int insertAtMid(int d){
        Node newN = new Node(d);

        
    }
}


class linkedlist{
    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.create();
        l.insertAtBeg(5);
    }
}