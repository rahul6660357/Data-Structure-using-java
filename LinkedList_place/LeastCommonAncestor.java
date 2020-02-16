package Placement;

import java.util.Scanner;

public class LeastCommonAncestor {
    Node root;
    class Node{
        Node left;
        Node right;
        int data;
        public Node(int data)
        {
            this.data= data;
            this.left= this.right= null;
        }
    }
    public void insert(int data)
    {
       root= insertrec(root, data);
    }
    public Node insertrec(Node root, int data)
    {
        Node new_node = new Node(data);
     if(root==null)
     {
         root= new_node;

     }
     else if(data< root.data)
     {
         root.left= insertrec(root.left, data);
     }
     else if(data>root.data)
     {
         root.right= insertrec(root.right, data);
     }
     return root;
    }
    public static void main(String Args[])
    {
        LeastCommonAncestor ll = new LeastCommonAncestor();
        Scanner sc = new  Scanner(System.in);
        int n;
        n= sc.nextInt();
        System.out.print("enter the nodes");
        for(int i=0;i<n;i++)
        {
            ll.insert(sc.nextInt());
        }

        Node ptr = ll.findleastcommon(ll.root,10, 14);
        System.out.print(ptr.data);
    }

    private  Node findleastcommon(Node root, int i, int i1) {
if(root==null)
{
    return root;
}
else if(root.data< i && root.data< i1)
{
    root= findleastcommon(root.right, i, i1);
}
else if(root.data>i && root.data > i1)
{
    root= findleastcommon(root.left, i, i1);
}
return root;
    }
}
