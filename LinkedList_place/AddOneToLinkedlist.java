package LinkedList_place;

import java.util.Scanner;

public class AddOneToLinkedlist {
    Node head;
    class Node{
        Node next;
        int data;
        public Node(int data)
        {
            this.data= data;
            this.next= null;
        }

    }
    private void push(int nextInt) {
        Node new_node = new Node(nextInt);
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
    public static void main(String Args[])
    {
        AddOneToLinkedlist aa = new AddOneToLinkedlist();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            aa.push(sc.nextInt());
        }

       Node ptr= aa.addone(aa.head);
        aa.print(ptr);
    }

    private void print(Node ptr) {
   Node ptr1= ptr;
   while(ptr1!=null)
   {
       System.out.print(ptr1.data+" ");
       ptr1= ptr1.next;
   }
    }

    private Node addone(Node head) {
        head = reverse(head);

        head= addoneutil(head);

        return reverse(head);
    }

    private Node addoneutil(Node head) {
        Node res= head;
        Node temp= null;
        int carry =1, sum;

        while(head!=null)
        {
            sum= head.data+carry;
            carry = (sum>= 10)?1:0;
            sum=sum%10;

            head.data= sum;

            temp= head;
            head= head.next;

        }
        if(carry>0)
        {
            Node new_node = new Node(carry);
            Node ptr= head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next= new_node;
        }
        return res;
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node curr= head;
        Node ptr= null;
        while(curr!=null)
        {
           ptr= curr.next;
           curr.next= prev;
           prev = curr;
           curr= ptr;
        }
        return  prev;
    }


}
