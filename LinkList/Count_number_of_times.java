package LinkList;

import java.util.Scanner;

public class Count_number_of_times {
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
    void getcount(int i){
        Node ptr=head;
        int count=0;
        while(ptr!=null)
        {
            if(ptr.data==i)
            {
                count++;
            }
            ptr=ptr.next;
        }
        System.out.println(count);

    }
    void removesimilar() {
        Node current= head;
        while (current.next!=null)
        {
            Node temp=current;
            while(temp.next!=null&& current.data==temp.data)
            {
                temp=temp.next;
            }
            current.next=temp;
            current=current.next;

        }

    }


    public static void main(String Args[])
    {
        Count_number_of_times list= new Count_number_of_times();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();
        list.getcount(1);
        list.printNodes();
        list.removesimilar();
        list.printNodes();
    }


}
