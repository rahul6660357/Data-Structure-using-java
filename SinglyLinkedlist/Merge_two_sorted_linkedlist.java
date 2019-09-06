package LinkList;

import java.util.Scanner;

public class Merge_two_sorted_linkedlist {
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
        System.out.println();
    }
    static void mergelists(Merge_two_sorted_linkedlist list, Merge_two_sorted_linkedlist list1) {
        Node ptr=list.head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=list1.head;
      sortlist(list);
    }

     static void sortlist(Merge_two_sorted_linkedlist list) {
        Node ptr1=list.head;
        Node ptr2= null;
        while(ptr1!=null)
        {
            ptr2=ptr1;
            while(ptr2!=null)
            {
                if(ptr1.data<ptr2.data)
                {
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
        Merge_two_sorted_linkedlist list= new Merge_two_sorted_linkedlist();
        Merge_two_sorted_linkedlist list1= new Merge_two_sorted_linkedlist();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.print("enter elements of list 1");
        for (int i = 0; i < n; i++) {
            list.additem(sc.nextInt());
        }
        System.out.print("enter elements of list 2");
        for (int i = 0; i < n; i++) {
            list1.additem(sc.nextInt());
        }
        list.printlist();
        list1.printlist();
        mergelists(list,list1);
        list.printlist();
    }


}
