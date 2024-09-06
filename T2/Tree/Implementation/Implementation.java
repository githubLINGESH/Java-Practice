import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int d){
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node create(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Elements");
        int d = s.nextInt();

        if(d==-1){
            return null;
        }

        Node nn = new Node(d);

        nn.left = create();
        nn.right = create();

        return nn;
    }

    void traversalInOrder(Node root){
        if(root == null){
            //System.out.print("Data:"+root.data+" ");
            return;
        }
        else{
            //System.out.println("Addresses:"+root);
            traversalInOrder(root.left);
            System.out.print(root.data+" ");
            traversalInOrder(root.right);
        }
    }

    void traversalPreOrder(Node root){
        if(root == null){
            //System.out.print("Data:"+root.data+" ");
            return;
        }
        else{
            System.out.print(root.data+" ");
            //System.out.println("Addresses:"+root);
            traversalPreOrder(root.left);
            traversalPreOrder(root.right);
        }
    }

    void traversalPostOrder(Node root){
        if(root == null){
            //System.out.print("Data:"+root.data+" ");
            return;
        }
        else{
            //System.out.println("Addresses:"+root);
            traversalPostOrder(root.left);
            traversalPostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }


}
class Implementation{
    public static void main(String[] args){
        Tree t = new Tree();

        Node root = t.create();
        //System.out.println(root);
        System.out.print("InOrder:");
        t.traversalInOrder(root);
        System.out.println();
        System.out.print("PreOrder:");
        t.traversalPreOrder(root);
        System.out.println();
        System.out.print("PostOrder:");
        t.traversalPostOrder(root);
    }
}