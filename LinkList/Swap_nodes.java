package LinkList;

import java.util.Scanner;

public class Swap_nodes {
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
    void printNodes() {
        Node ptr= head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
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
    void swapnodes(int x, int y) {
        if(x==y)
        {
            return;
        }
        Node prevX=null;
        Node curX=head;
        while (curX!=null && curX.data!=x)
        {
            prevX=curX;
            curX=curX.next;
        }
        Node prevY=null;
        Node curY=head;
        while(curY!=null && curY.data!=y)
        {
            prevY=curY;
            curY=curY.next;
        }
        if(curX==null || curY==null )
        {
            return;
        }
        if(prevX!=null)
        {
            prevX.next=curY;

        }
        else {
            head=curY;
        }
        if(prevY!=null)
        {
            prevY.next=curX;

        }
        else {
            head=curY;
        }
        Node temp=curX.next;
        curX.next=curY.next;
        curY.next=temp;
    }
    public static void main(String Args[])
    {
        Swap_nodes list= new Swap_nodes();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.swapnodes(2,4);
        list.printNodes();
    }

}
