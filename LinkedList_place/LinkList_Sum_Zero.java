package LinkedList_place;

import java.util.Scanner;
import java.util.Stack;

public class LinkList_Sum_Zero {
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
    public static void main(String Args[])
    {
        LinkList_Sum_Zero ll = new LinkList_Sum_Zero();
        Scanner sc= new Scanner(System.in);
        int n;
         n= sc.nextInt();
         for(int i=0;i<n;i++)
         {
            ll.add(sc.nextInt());
         }
        Node head = ll.deletenodesumzero(ll.head);

         ll.print(head);
    }

    private void print(Node head) {
    Node ptr= head;
    while(ptr!=null)
    {
        System.out.print(ptr.data+" ");
        ptr=ptr.next;
    }
    }

    private Node deletenodesumzero(Node head) {
        Stack<Node> st = new Stack<>();

        Node ptr= head;
        while(ptr!=null)
        {
            if(ptr.data < 0)
            {
                int sum= ptr.data;
                while(!st.isEmpty())
                {
                    Node temp= st.pop();
                    sum-=temp.data;
                    if(sum==0)
                    {
                        ptr= st.peek();
                        break;
                    }
                }
            }
            else{
                st.push(ptr);
            }
            ptr= ptr.next;
        }
        return head;
    }

    private void add(int a) {
        Node new_node = new Node(a);
        if(head== null)
        {
            head= new_node;
        }
        else{
            Node ptr= head;
            while(ptr.next!=null)
            {
                ptr= ptr.next;
            }
            ptr.next= new_node;
        }
    }
}
