package LinkedList;

import java.util.Scanner;

public class Reverse_with_recursion {
    Node head;
    class Node{
        Node next;
        int data;
        public Node(int d)
        {
            this.data=d;
        }

    }
    void pushitem(int d) {
        Node new_node= new Node(d);
        new_node.next=null;
        if(head==null)
        {
            head=new_node;
        }
        else {
            Node ptr = head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=new_node;
        }
    }

    static void printlist(Reverse_with_recursion list) {

        Node ptr= list.head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
//    public Reverse_with_recursion reverse()
//    {
//        Node current;
//        return list;
//
//    }

    public static void main(String Args[])
    {
        Reverse_with_recursion list= new Reverse_with_recursion();
        System.out.println("enter the number of nodes you want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.pushitem(sc.nextInt());
        }
        printlist(list);
      //  list.reverse();
        printlist(list);
    }
}
