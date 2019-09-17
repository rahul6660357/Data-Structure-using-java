package LinkList;

import java.util.Scanner;

public class Delete_key_3 {
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
    void deleteNode(int i) {
        Node ptr=head;
        while(ptr!=null)
        {
            if(ptr.data==i)
            {
                break;
            }
            ptr=ptr.next;
        }
ptr.next=ptr.next.next;
    }

    public static void main(String Args[])
    {
        Delete_key_3 list= new Delete_key_3();
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.deleteNode(1);
        list.printNodes();
    }



}
