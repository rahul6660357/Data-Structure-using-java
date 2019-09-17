package Doubly_linkedlist;

import java.util.Scanner;

public class Reverse_doubly_linkedlist {
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
    void reverse() {
    Node ptr=tail;
    while (ptr!=null)
    {
        System.out.print(ptr.data+" ");
        ptr=ptr.prev;
    }
    }
    void sortlist() {
Node ptr1=null;
Node ptr2=null;
ptr1=head;
while (ptr1!=null)
{
    ptr2=ptr1;
    while (ptr2!=null)
    {
        if(ptr1.data<ptr2.data){
            int temp=ptr1.data;
            ptr1.data=ptr2.data;
            ptr2.data=temp;
        }
        ptr2=ptr2.next;
    }
    ptr1=ptr1.next;
}
    }

    public static void main(String Args[])
    {
        Reverse_doubly_linkedlist list= new Reverse_doubly_linkedlist();
        System.out.println("enter the number of nodes your want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertvaluelast(sc.nextInt());
        }
        list.display();
     //   list.reverse();

        list.sortlist();
        list.display();
    }



}
