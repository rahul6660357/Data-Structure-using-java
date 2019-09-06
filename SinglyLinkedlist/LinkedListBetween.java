package LinkedList;


import java.util.Scanner;

public class LinkedListBetween {
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

    static void printlist(LinkedListBetween list) {

        Node ptr= list.head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    void pushbtw(int pos, int i) {

        Node new_node = new Node(i);
        int count=0;
        Node ptr=head;
        while(ptr.next!=null)
        {

            if(count==pos)
            {
                break;

            }
            count++;
            ptr=ptr.next;
        }
        new_node.next = ptr.next;
        ptr.next = new_node;
    }
     void deletekey(int key) {
        Node ptr= head;
        while (ptr.next!=null)
        {
            if(ptr.next.data==key)
            {
           break;
            }
            ptr=ptr.next;
        }
         ptr.next=ptr.next.next;
    }

    public static  void main(String Args[])
    {
        LinkedListBetween list = new LinkedListBetween();
       System.out.println("enter the number of nodes you want to enter");
       int n;
       Scanner sc= new Scanner(System.in);
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           list.pushitem(sc.nextInt());
       }
       printlist(list);
       list.pushbtw(2, 8);
        printlist(list);
        list.deletekey(2);
        printlist(list);

    }



}
