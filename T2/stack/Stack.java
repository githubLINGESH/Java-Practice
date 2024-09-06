import java.util.*;

class ImpStack{
    Scanner s = new Scanner(System.in);
    int top = -1;
    int n = 5;
    int[] stack = new int[n];

    void add(){
        System.out.print("Enetr the elements:");
        int d = s.nextInt();

        top++;
        stack[top] = d;
    }

    void peek(){
        System.out.println(stack[top]);
    }

    void isEmpty(){
        if(top==-1){
            System.out.println("Null");
        }
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
}

class Stack{
    public static void main(String[] args){
        ImpStack s = new ImpStack();

        s.add();
        s.add();
        s.add();
        s.display();

        ImpStack s1 = new ImpStack();

        s1.display();
    }
}