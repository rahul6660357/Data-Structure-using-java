package LinkList;

import java.util.Scanner;

public class Getting_nth_node_5 {
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
    void findelement(int i) {
        Node ptr=head;
        int count=0;
        while(ptr!=null)
        {
            count++;
            if(count==i)
            {
                System.out.println("element "+ptr.data+" is found at pos"+count);
            }
            ptr=ptr.next;
        }
    }
public static void main(String Args[]) {
    Getting_nth_node_5 list=new Getting_nth_node_5();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("enter the number of nodes you want to enter");
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        list.insertNode(sc.nextInt());
    }
    list.printNodes();
    list.findelement(4);
}


}
