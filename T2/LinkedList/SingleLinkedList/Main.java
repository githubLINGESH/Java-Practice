import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
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
            tail.next = newN;
            tail = newN;
        }
    }

    void insertAtBeg(int d){
        Node newN = new Node(d);

        if(head==null){
            create();
        }
        else{
            newN.next = head;
            head = newN;
        }
    }

    void insertAtMid(int d, int pos){
        Node newN = new Node(d);

        if(head==null){
            create();
        }
        else{
            Node t = head;

            for(int i=1;i<pos-1;i++){
                t = t.next;
            }

            newN.next = t.next;
            t.next = newN;
        }
    }

    void insertAtEnd(int d){
        Node newN = new Node(d);

        if(head==null){
            create();
        }
        else{
            tail.next = newN;
            tail = newN;
        }
    }

    void transversal(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Main{
    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.create();
        l.insertAtBeg(10);
        l.insertAtBeg(20);
        l.insertAtBeg(30);
        l.insertAtMid(2,4);
        l.insertAtEnd(1);
        l.transversal();

    }
}