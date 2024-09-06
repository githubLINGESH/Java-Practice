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

    Node create(Node root, int el){

        if(root==null){
            return new Node(el);
        }

        if(el<root.data){
            root.left = create(root.left,el);
        }
        else if(el>root.data){
            root.right = create(root.right,el);
        }

        return root;
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
    
    Node search(Node root, int el){
        if(root==null){
            System.out.println("First Add");
            return root;
        }

        if(el==root.data){
            System.out.println("It's there");
            return root;
        }
        
        else if(el<root.data){
            search(root.left,el);
        }
        else{
            search(root.right,el);
        }

        return root;
    }




}
class BstImplementation{
    public static void main(String[] args){
        Tree t = new Tree();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        Node root = null;
        for(int i=0;i<n;i++){
            root = t.create(root,a[i]);
        }

        System.out.print("InOrder:");
        t.traversalInOrder(root);
        // System.out.println();
        // System.out.print("PreOrder:");
        // t.traversalPreOrder(root);
        // System.out.println();
        // System.out.print("PostOrder:");
        // t.traversalPostOrder(root);

        t.search(root,5);
    }
}