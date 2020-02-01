package LinkedList_place;

import java.util.Scanner;

public class SumOfTwoLinkedList {
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
        SumOfTwoLinkedList ss= new SumOfTwoLinkedList();
        SumOfTwoLinkedList ss1= new SumOfTwoLinkedList();
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.print("enter the no of elements in ll 1");
        n= sc.nextInt();
        System.out.print("enter elements");
        for(int i=0;i<n;i++)
        {
            ss.push(sc.nextInt());
        }
        System.out.print("enter the no of elements in ll 2");
        n= sc.nextInt();
         System.out.print("enter elements");
        for(int i=0;i<n;i++)
        {
            ss1.push(sc.nextInt());
        }

       Node ptr= ss.sumoflists(ss.head, ss1.head);
        ss.printlist(ptr);
    }

    private void printlist(Node ptr) {
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }

    private Node sumoflists(Node head, Node head1) {
      Node res= null;
      Node prev= null;
      Node temp=null;
      int carry =0, sum;

      while(head!=null && head1!=null)
      {
          sum = carry+ (head !=null ? head.data:0) + (head1!=null ? head1.data: 0);

          carry = (sum>=10)?1:0;
          sum=sum%10;

          Node new_node = new Node(sum);
          if(temp==null)
          {
              temp= new_node;
          }
          else{
              Node nn = temp;
              while(nn.next!=null)
              {
                  nn= nn.next;
              }
              nn.next= new_node;
          }
          if(head!=null)
          {
              head= head.next;
          }
          if(head1!=null)
          {
              head1= head1.next;
          }
      }
      if(carry> 0)
      {
          Node new_node = new Node(carry);
          Node nn = temp;
          while(nn.next!=null)
          {
              nn= nn.next;
          }
          nn.next= new_node;

      }
     return temp;
    }
}
