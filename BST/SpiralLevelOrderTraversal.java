package BST;

import java.util.Scanner;

public class SpiralLevelOrderTraversal {
    Node root;
    class Node {
        Node left, right;
        int data;
        public Node( int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
    private void insert(int i) {
        root=inorder(root,i);
    }

    public Node inorder(Node root, int i){
        Node new_node = new Node(i);
        if(root==null){

            root=new_node;
            return root;
        }
        if(i < root.data) {
            root.left=inorder(root.left,i);
        }
        else if(i> root.data){
            root.right=inorder(root.right, i);
        }
        return root;
    }

    private void print() {
        printorder(root);
    }

    private void printorder(Node root) {
        if(root!=null){
            printorder(root.left);
            System.out.println(root.data);
            printorder(root.right);
        }
    }
    public static void printspiral(Node root)
    {
        if(root==null)
            return;

        int h= findheight(root);
         boolean b= true;
        for(int i=0;i<=h;i++)
        {
            printspirallevel(root,i,b);
            b= !b;
        }
    }
    public static void printspirallevel(Node root, int level, boolean b)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
        }

        if(b==true)
        {
            printspirallevel(root.left,level-1,b);
            printspirallevel(root.right,level-1,b);
        }
        else{
            printspirallevel(root.right,level-1,b);
            printspirallevel(root.left,level-1,b);
        }
    }
    public static int findheight(Node root)
    {
        if(root==null)
            return 0;
        int l= findheight(root.left);
        int r= findheight(root.right);
        if(l>r)
        {
            return l+1;
        }
        return r+1;
    }
public static void main(String Args[])
{
    SpiralLevelOrderTraversal ll= new SpiralLevelOrderTraversal();
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=0;i<n;i++)
    {
       ll.insert(sc.nextInt());
    }
    ll.print();
    System.out.println();
    ll.printspiral(ll.root);

}
}
