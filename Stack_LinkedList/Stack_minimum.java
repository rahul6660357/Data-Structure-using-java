package Stack_LinkedList;

import java.util.Scanner;

public class Stack_minimum {
//    Stack_minimum list2= new Stack_minimum();
    Node head=null;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }


    void push(int d) {
        Node new_node= new Node(d);

        if(head==null)
        {
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }


    }
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void getmin() {

    }

    public static void main(String args[])

    {
        Stack_minimum list= new Stack_minimum();
        int n=0;
        Scanner sc= new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
        {
            System.out.println("enter element you add");
            list.push(sc.nextInt());
        }
        list.display();
        list.getmin();
    }



}
