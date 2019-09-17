package Doubly_linkedlist;

import java.util.Scanner;

public class Merge_two_sorted_doubly_list {
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
    static void merge(Merge_two_sorted_doubly_list list1, Merge_two_sorted_doubly_list list2) {
        Node ptr1=list1.head;
        Node pt2=list2.head;
        while (ptr1!=null && pt2!=null)
        {

        }

    }
    public static void main(String Args[])
    {
        Merge_two_sorted_doubly_list list1= new Merge_two_sorted_doubly_list();
        Merge_two_sorted_doubly_list list2= new Merge_two_sorted_doubly_list();
        System.out.println("enter the number of nodes your want to enter in list1");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list1.insertvaluelast(sc.nextInt());
        }
        System.out.println("enter the number of nodes your want to enter in list2");
        int m;
        m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            list2.insertvaluelast(sc.nextInt());
        }
        list1.display();
        list2.display();
        merge(list1,list2);
    }


}
