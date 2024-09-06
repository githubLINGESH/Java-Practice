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
    Node head = null;
    Node tail = null;
    void create(int d){
        Node newN = new Node(d);

        if(head==null){
            head = tail = newN;
        }
        else {
            tail.next = newN;
            tail = newN;
        }
    }
}

class Addition{
    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.create(5);
        l.create(4);
        l.create(6);
        
        LinkedList l1 = new LinkedList();

        l1.create(3);
        l1.create(6);
        l1.create(2);

        LinkedList su = new LinkedList();

        Node t = l.head; Node t1 = l1.head;
        int sum = 0;
        int carry = 0;
        while(t!=null || t1!=null){
            sum = carry;
            if(t!=null){
                sum += t.data;
                t = t.next;
            }
            if(t1!=null){
                sum+= t1.data;
                t1 = t1.next;
            }

            su.create(sum%10);
            carry = sum/10;
        }

        if(carry>0){
            su.create(carry);
        }

        //System.out.println(su.head.data);
    }
}

