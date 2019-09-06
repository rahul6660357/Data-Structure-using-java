package LinkList;

import java.util.Scanner;

public class Move_last_element_to_front {
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
    void movenode() {
        if(head==null || head.next==null)
        {
            return;
        }
        Node prev= null;
        Node ptr= head;
        while (ptr.next!=null)
        {

            prev=ptr;
            ptr=ptr.next;
        }
        prev.next=null;
        ptr.next=head;
        head=ptr;



    }

    public static void main(String Args[])
    {
        Move_last_element_to_front list= new Move_last_element_to_front();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.movenode();
        list.printNodes();
    }


}
