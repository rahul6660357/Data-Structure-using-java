package LinkList;

import java.util.Scanner;

public class Separate_even_odd {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void additem(int d) {
        Node new_node= new Node(d);

        if(head==null)
        {
            head=new_node;
        }
        else{
            Node ptr= head;

        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=new_node;
        }
    }
    void printlist() {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    void separate_even_odd() {
        if(head==null)
        {
            return;
        }
        Node ptr=head;
        int count=0;
        while (ptr!=null)
        {
            ptr=ptr.next;
            count++;
        }
        Node ptr1=head;
        for(int i=0;i<count;i++)
        {
            if(ptr1.data%2!=0)
            {

            }
            else{

            }
        }
    }

    public static void main(String Args[])
    {
        Separate_even_odd list= new Separate_even_odd();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.additem(sc.nextInt());
        }
        list.printlist();
        list.separate_even_odd();
    }



}
