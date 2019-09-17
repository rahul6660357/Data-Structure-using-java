package LinkList;

import java.util.Scanner;

public class Nth_node_from_last {
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
    void findfromlast(int i) {
        int count=0;
        Node ptr=head;
        while (ptr!=null)
        {

            ptr=ptr.next;
            count++;
        }
        ptr=head;

        for (int a=1;a<count-i+1;a++)
            ptr=ptr.next;

        System.out.println(ptr.data);
    }
    public static void main(String Args[]) {
        Nth_node_from_last list= new Nth_node_from_last();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.findfromlast(3);
        list.printNodes();
    }


}
