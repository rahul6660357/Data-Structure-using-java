package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int i)
        {
            this.data=i;
        }
    }
    public static LinkedList1 insert(LinkedList1 L, int d)
    {
        Node newnode= new Node(d);
        newnode.next=null;
        if(L.head==null)
        {
            L.head=newnode;
        }
        else {
            Node ptr= L.head;
            while (ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }

       return  L;
    }
    public  static void print(LinkedList1 L)
    {
        Node ptr= L.head;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    static int count_node(LinkedList1 L) {
        int count=1;
        Node ptr= L.head;
        while(ptr.next!=null)
        {
            count++;
            ptr=ptr.next;
        }

        return count;
    }
    static int find_mid(LinkedList1 L, int value) {
        int mid=1;
        Node ptr= L.head;
        while (ptr.next!=null)
         {
             mid++;
             ptr=ptr.next;
           if(mid==value/2)
           {
               return ptr.data;
           }
         }




        return  mid;
    }
    static int find_midvalue(LinkedList1 ll) {
       Node  ptr2=ll.head;
       Node ptr1=ll.head;
       while(ptr2!=null&& ptr2.next!=null)
       {
           ptr1=ptr1.next;
           ptr2=ptr2.next.next;

       }
       return ptr1.data;

    }

    public static void main(String Args[])
    {
    LinkedList1 ll= new LinkedList1();
        ll=insert(ll,10);
        ll=insert(ll,70);
        ll=insert(ll,20);
        ll=insert(ll,30);
        ll=insert(ll,40);
        ll=insert(ll,50);
        ll=insert(ll,60);
        ll=insert(ll,70);
        print(ll);
        int value=count_node(ll);
        System.out.println("no of nodes in linkedlist is "+value);
          if(value%2!=0) {
              int mid = find_mid(ll, value);
              System.out.print("mid value of linked list is/are" + mid);
          }
          else {
              int a = find_midvalue(ll);
              System.out.print("midvalue of linked list is/are" + a);
          }



    }



}

