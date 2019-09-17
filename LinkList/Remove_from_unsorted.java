package LinkList;

import java.util.Scanner;

public class Remove_from_unsorted {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }
    void printNodes() {
        Node ptr= head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }

    void insertNode(int d) {
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
    void removeduplicates() {
//        Node ptr1=null;
//        Node ptr2=null;
//        Node dup=null;
//        ptr1=head;
//        while(ptr1!=null && ptr1.next!=null)
//        {
//            ptr2=ptr1;
//            while (ptr2.next!=null)
//            {
//                if(ptr1.data==ptr2.next.data)
//                {
//                    dup=ptr2.next;
//                    ptr2.next=ptr2.next.next;
//                    System.gc();
//                }
//                else {
//                    ptr2=ptr2.next;
//                }
//
//            }
//            ptr1=ptr1.next;
//        }



Node ptr1=null;
Node ptr2=null;
Node dup=null;
ptr1=head;
while (ptr1!=null && ptr1.next!=null)
{
    ptr2=ptr1;
    while (ptr2.next!=null)
    {
        if(ptr1.data==ptr2.next.data)
        {
            ptr2.next=ptr2.next.next;
        }
        else{
            ptr2=ptr2.next;
        }


    }
    ptr1=ptr1.next;
}
    }

    public static void main(String Args[])
    {
        Remove_from_unsorted list= new Remove_from_unsorted();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.removeduplicates();
        list.printNodes();

    }


}
