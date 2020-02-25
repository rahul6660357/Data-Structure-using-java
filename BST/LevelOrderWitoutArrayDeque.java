package BST;

import java.util.Scanner;

public class LevelOrderWitoutArrayDeque {
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
    public static void levelorder(Node root)
    {
        int h= findHeight(root);
        for(int i=0;i<=h;i++)
        {
            printlevel(root,i);
        }
    }
    public static void printlevel(Node root,int level)
    {
        if(root==null)
            return;
        if(level==1)
        {
            System.out.print(root.key+" ");
        }

        printlevel(root.left,level-1);
        printlevel(root.right,level-1);
    }
    public static int findHeight(Node root)
    {
        if(root==null)
            return 0;

        int l= findHeight(root.left);
        int r= findHeight(root.right);
        if(l>r)
            return l+1;
        else
            return r+1;
    }
    public static void main(String Args[])
    {
        LevelOrderWitoutArrayDeque ff = new LevelOrderWitoutArrayDeque();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ff.insert(sc.nextInt());
        }

        ff.print();

        ff.levelorder(ff.root);
    }
}
