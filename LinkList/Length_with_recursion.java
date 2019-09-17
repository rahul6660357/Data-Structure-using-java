package LinkList;

import java.util.Scanner;

public class Length_with_recursion {
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


     int get_count(Node node) {
         if(node==null)
         {
             return 0;
         }
         else {
             return 1 + getcount(node.next);
         }
    }

    private int getcount(Node next) {
        return  get_count(next);
    }


    public static void main(String Args[])
    {
        Length_with_recursion list= new Length_with_recursion();
        System.out.println("enter the number of nodes you want to eneter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }

        list.printNodes();
       int abc= list.getcount(list.head);
       System.out.println(abc);

    }



}
