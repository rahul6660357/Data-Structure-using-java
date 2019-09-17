package LinkList;

import java.util.Scanner;

public class Reverse_linkedlist {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void additem(int d) {
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
    void printlist() {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public Node reverselist(Node head) {

Node prev=null;
Node curr=head;
Node next=null;
while(curr!=null)
{
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
head=prev;
return head;




    }
    public static void main(String Args[]) {
        Reverse_linkedlist list= new Reverse_linkedlist();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.additem(sc.nextInt());
        }
        list.printlist();
        list.reverselist(list.head);
        list.printlist();
    }


}
