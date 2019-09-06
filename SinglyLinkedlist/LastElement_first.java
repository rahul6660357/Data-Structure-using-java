package LinkedList;

import java.util.Scanner;

public class LastElement_first {
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



    static void printlist(LastElement_first list) {
        Node ptr= list.head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    static void movelastfirst(LastElement_first list) {
        int i=0;
        while(i<3) {
            Node ptr = list.head;
            Node prev = null;
            while (ptr.next != null) {
                prev = ptr;
                ptr = ptr.next;
            }
            prev.next = null;
            ptr.next = list.head;
            list.head = ptr;
            i++;

        }
    }


    public static void main(String Args[])
    {
        LastElement_first list= new LastElement_first();
        System.out.println("enter the number of nodes you want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.pushitem(sc.nextInt());
        }
        printlist(list);
        movelastfirst(list);
        printlist(list);
    }



}
