package LinkedList_place;

import java.util.Scanner;

public class Flattened_Linkedlist {
    Node head;
    class Node{
        Node right;
        Node down;
        int data;
        public Node(int data)
        {
            this.data= data;
            this.right=null;
            this.down= null;
        }
    }
    public Node flatten(Node root)
    {
        if(root== null || root.right==null)
        {
            return root;
        }
        root.right= flatten(root.right);

        root =merge(root, root.right);

        return root;
    }

    private Node merge(Node a, Node b) {
        if(a == null)
        {
            return b;
        }
        if(b== null)
        {
            return a;
        }
        Node result = null;
        if(a.data< b.data)
        {
            result= a;
            result.down = merge(a.down, b);
        }
        else if(b.data< a.data)
        {
            result=b;
            result.down= merge(b.down,a);
        }
        return result;
    }

    public Node push(Node ref_head, int data)
    {
        Node new_node = new Node(data);
        new_node.down= ref_head;
        ref_head= new_node;

        return  ref_head;

    }
    public static void main(String Args[])
    {
Scanner sc= new Scanner(System.in);

Flattened_Linkedlist ff = new Flattened_Linkedlist();

        ff.head = ff.push(ff.head, 30);
        ff.head= ff.push(ff.head, 8);
        ff.head = ff.push(ff.head, 7);
        ff.head= ff.push(ff.head, 5);

        ff.head.right = ff.push(ff.head.right,20);
        ff.head.right = ff.push(ff.head.right,10);

        ff.head.right.right = ff.push(ff.head.right.right,50);
        ff.head.right.right = ff.push(ff.head.right.right,22);
        ff.head.right.right = ff.push(ff.head.right.right,19);

        ff.head.right.right.right = ff.push(ff.head.right.right.right,45);
        ff.head.right.right.right = ff.push(ff.head.right.right.right,40);
        ff.head.right.right.right = ff.push(ff.head.right.right.right,28);

        ff.head= ff.flatten(ff.head);

        ff.printlist(ff.head);
    }

    private void printlist(Node head) {
        Node ptr= head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr= ptr.down;
        }
    }
}
