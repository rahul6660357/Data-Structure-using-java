package LinkList;

import java.util.Scanner;

public class Delete_node_2 {
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
        else
        {
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
    void deleteNode(int pos) {
        Node ptr=head;
        int count=0;
        while (ptr!=null)
        {

            if(count+2==pos)
            {
                break;
            }
            count++;
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;

    }

    public  static void main(String Args[])
    {
        Delete_node_2 list= new Delete_node_2();
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.deleteNode(5);
        list.printNodes();
    }



}
