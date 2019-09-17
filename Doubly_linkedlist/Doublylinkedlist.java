package Doubly_linkedlist;

import java.util.Scanner;

public class Doublylinkedlist {
    Node head, tail;
    class Node{
        Node next;
        Node prev;
        int data;
        public Node(int data)
        {
            this.data=data;
            next=null;
            prev=null;
        }
    }

    void insertback(int d) {
    Node new_node = new Node(d);
    if(head==null)
    {
        head=new_node;
        tail=new_node;
    }
    else{


        new_node.prev=tail;
        new_node.next=null;
        tail.next=new_node;
        tail=tail.next;

    }
    }
    void displaylist() {
      Node ptr=head;
      while(ptr!=null)
      {
          System.out.print(ptr.data+" ");
          ptr=ptr.next;
      }
    }
    void insertfront(int d) {
        Node new_node= new Node(d);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            new_node.next=head;
            head.prev=new_node;
            head=new_node;

        }
    }
    void deletebeg() {

        if(head==null)
        {
            System.out.print("linkedlist is empty");
        }
        else if(head.next!=null)
        {
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
        Node ptr= head;
        int count=0;
        while (head!=null)
        {
            if(count==i)
            {
                ptr.next=ptr.next.next;
                ptr.prev=ptr.prev.prev;

            }
        }
    }

    public static void main(String Args[])
    {
        Doublylinkedlist list= new Doublylinkedlist();
        Doublylinkedlist list2= new Doublylinkedlist();
        System.out.println("enter the number of nodes you want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("enter element  to add in back");
        for(int i=0;i<n;i++)
        {
            list.insertback(sc.nextInt());

        }
        list.displaylist();
//        System.out.print("enter element  to add in front");
//        for(int i=0;i<n;i++) {
//            list2.insertfront(sc.nextInt());
//        }
//        list2.displaylist();
//        System.out.println("deleting element from begining");
     //   list.deletebeg();
      //  list.displaylist();
        System.out.println("deleting element from last");
      //  list.deletelast();
       // list.displaylist();
        list.deletepos(2);
        list.displaylist();
    }



}
