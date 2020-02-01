package LinkedList_place;

import java.util.Scanner;

public class MiddleElement {
    Node head;
    class Node{
        Node next;
        int data;
        public Node(int data){
            this.data= data;
            this.next=null;

        }
    }
    public  void addelement(int data)
    {
        Node new_node = new Node(data);
        if(head== null)
        {
            head= new_node;
        }
        else{
            Node ptr= head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next= new_node;
        }
    }
    public void findmiddle()
    {
        Node slow_ptr= head;
        Node fast_ptr= head;

        while(fast_ptr!= null && fast_ptr.next!= null)
        {
            slow_ptr= slow_ptr.next;
            fast_ptr= fast_ptr.next.next;
        }
        System.out.println(slow_ptr.data);
    }
    public static void main(String Args[])
    {
        MiddleElement mm = new MiddleElement();
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        System.out.println("enter the number of elements in linkedlist");
        for(int i=0;i<n;i++)
        {
            mm.addelement(sc.nextInt());
        }

        mm.findmiddle();
    }
}
