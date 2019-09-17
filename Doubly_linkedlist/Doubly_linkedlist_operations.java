package Doubly_linkedlist;

import java.util.Scanner;

public class Doubly_linkedlist_operations {
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
     void insertvaluelast(int d) {
        Node new_node = new Node(d);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else {

            new_node.prev=tail;
            tail.next=new_node;
            tail=tail.next;
        }
    }
    void display()
    {
        Node ptr=head;
        while (ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    void insertfront(int i) {
        Node new_node = new Node(i);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else {
            new_node.next=head;
            head.prev=new_node;
            head=new_node;


        }
    }
    void deletefront() {
        if(head==null)
        {
            System.out.println("the linkedlist is empty i. e , no element");
        }
        else{
            head=head.next;
            head.prev=null;

        }
    }
    void deletelast() {
        if(tail==null)
        {
            System.out.print("linklist is empty");

        }
        else  {
            tail=tail.prev;
            tail.next=null;

        }
    }
    void deletepos(int i) {
        Node ptr=head;
        int count=1;
        while (ptr.next!=null)
        {
            if(count==i)
            {
                ptr.next=ptr.next.next;
                ptr.prev=ptr.prev.prev;

            }
            ptr=ptr.next;
        }
    }


    public static void main(String Args[])
    {
        Doubly_linkedlist_operations list= new Doubly_linkedlist_operations();
        System.out.println("enter the number of nodes your want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertvaluelast(sc.nextInt());
        }
        list.insertfront(6);
        list.deletefront();
        list.deletelast();
        list.deletepos(2);
        list.display();
    }


}
