package LinkList;

import java.util.Scanner;

public class Insert_value_1 {
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
    void insert_value(int d) {
//        Node new_node= new Node(d);  //inserting data from front
//        new_node.next=head;
//        head=new_node;

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
     void printlist()
    {
        Node ptr= head;

        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public static void main(String Args[])
    {
        Insert_value_1 list= new Insert_value_1();
        System.out.println("enter the number of nodes you want to enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert_value(sc.nextInt());
        }
        list.printlist();
    }


}
