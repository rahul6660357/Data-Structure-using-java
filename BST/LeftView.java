package BST;

import java.util.Scanner;

public class LeftView {
    public static int max_level=0;
    Node root;
    class Node{
        Node left, right;
        int key;
        public Node(int key)
        {
            this.key=key;
            this.left=this.right=null;

        }
    }
    private void insert(int i) {
        root= InsertRec(root,i);
    }

    private Node InsertRec(Node root, int i) {
        Node new_node = new Node(i);
        if(root==null)
        {
            root=new_node;
        }
        if(i<root.key)
        {
            root.left=InsertRec(root.left,i);
        }
        else if(i>root.key){
            root.right= InsertRec(root.right,i);
        }
        return root;
    }
    private void print() {
        printRec(root);
    }

    private void printRec(Node root) {
        if(root!=null)
        {
            printRec(root.left);
            System.out.println(root.key);
            printRec(root.right);
        }
    }
    public static void main(String Args[])
    {
        LeftView ff = new LeftView();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           ff.insert(sc.nextInt());
        }

        ff.print();
        ff.printleftview(ff.root);
    }

    private void printleftview(Node root) {
        leftview(root,1);
    }

    private void leftview(Node root, int level) {
        if(root==null)
            return;

        if(max_level<level)
        {
            System.out.print(root.key+" ");
            max_level=level;
        }
        leftview(root.left,level+1);
        leftview(root.right,level+1);
    }
}
