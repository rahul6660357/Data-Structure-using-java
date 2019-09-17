package LinkList;

import java.util.Scanner;

public class Pair_wise_swapping {
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
    void swapnodes() {
        Node ptr=head;
        while (ptr!=null && ptr.next!=null)
        {
            int k=ptr.next.data;
            ptr.next.data=ptr.data;
            ptr.data=k;
            ptr=ptr.next.next;
        }
    }

    public static void main(String Args[])
    {
        Pair_wise_swapping list= new Pair_wise_swapping();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.swapnodes();
        list.printNodes();
    }



}
