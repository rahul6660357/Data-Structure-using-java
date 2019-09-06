package LinkedList;


import java.util.Scanner;

public class LinkedListGeeks {
    Node head;
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        next=null;
    }

}
     void push(int data) {   // in this ques we insert the the data in the front of of linkedlist;
    Node new_node= new Node(data);
new_node.next=head;
head= new_node;
    }
    public  static void printlist(LinkedListGeeks L)
    {
        Node ptr= L.head;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    public static void main(String Args[])
    {
LinkedListGeeks list = new LinkedListGeeks();
System.out.println("enter the number of nodes you want to enter");
Scanner sc= new Scanner(System.in);
int n;
n=sc.nextInt();
for(int i=0;i<n;i++)
{
    list.push(sc.nextInt());
}
list.push(15);
printlist(list);

    }



}
