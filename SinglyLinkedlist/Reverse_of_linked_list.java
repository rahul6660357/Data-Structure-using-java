package LinkedList;

import java.util.Scanner;

public class Reverse_of_linked_list {
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

    static void printlist(Reverse_of_linked_list list) {

        Node ptr= list.head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    void reverse() {
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    public  static void main(String Args[])
    {
        Reverse_of_linked_list list= new Reverse_of_linked_list();
        System.out.println("enter the number of nodes you want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.pushitem(sc.nextInt());
        }
        printlist(list);
        list.reverse();
        printlist(list);
    }


}
