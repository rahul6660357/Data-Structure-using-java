package LinkList;

import java.util.Scanner;

public class Quick_sorting {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
        }
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
    void printNodes() {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
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
    public  static void main(String args[])
    {
        Quick_sorting list= new Quick_sorting();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.sortlist();
        list.printNodes();
    }



}
