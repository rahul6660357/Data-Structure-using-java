package LinkedList;

import java.util.Scanner;

public class Delete_kth_from_last {

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



    static void printlist(Delete_kth_from_last list) {
        Node ptr= list.head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
     void deletekth(int i) {
        Node ptr= head;
        int count=0;
        while(ptr!=null)
        {
            count++;

        }

    }
    public  static  void main(String Args[])
    {
        Delete_kth_from_last list= new Delete_kth_from_last();
        System.out.println("enter the number of nodes you want to enter");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.pushitem(sc.nextInt());
        }
        printlist(list);
        list.deletekth(2);
        printlist(list);
    }


}
