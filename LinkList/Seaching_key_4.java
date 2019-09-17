package LinkList;

import java.util.Scanner;

public class Seaching_key_4 {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next= null;
        }
    }
    void insertNode(int d){
        Node new_node= new Node(d);

        if(head==null)
        {
            head=new_node;
        }
        else{
            Node ptr=head;
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
    }
    boolean search(int i) {
        Node ptr= head;
        while(ptr!=null)
        {
            if(ptr.data==i)
            {
                System.out.println("data is present");
                return true;

            }
            ptr=ptr.next;

        }


        return false;
    }

    public static void main(String Args[])
    {
        Seaching_key_4 list= new Seaching_key_4();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertNode(sc.nextInt());
        }

        list.printNodes();
       boolean b= list.search(4);
    }



}
