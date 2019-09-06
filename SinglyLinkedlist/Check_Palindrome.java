package LinkList;

import java.util.Scanner;
import java.util.Stack;

public class Check_Palindrome {
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
        Node ptr= head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    void checkpalindrome() {
        Node ptr=head;
        Stack<Integer>st= new Stack();
        while(ptr!=null)
        {
           st.push(ptr.data);
           ptr=ptr.next;
        }
        Node ptr1=head;
        int flag=0;

        while(ptr1!=null)
        {
             flag=0;
            if(st.pop()!=ptr1.data)
            {
                flag=1;
                break;
            }
            ptr1=ptr1.next;

        }
         if(flag==1)
         {
             System.out.println("noooooeee");
         }
         else
         {
             System.out.println("yoooooo");
         }

    }

    public static void main(String Args[])
    {
        Check_Palindrome list= new Check_Palindrome();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.checkpalindrome();
    }



}
