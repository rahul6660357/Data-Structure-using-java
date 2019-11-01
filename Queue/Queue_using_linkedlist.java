package Queue;

import java.util.Scanner;

public class Queue_using_linkedlist {
    Node front ,rear;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public Queue_using_linkedlist() {
        this.front=null;
        this.rear=null;
    }

    private void addElement(int data) {
    Node new_node=new Node(data);
        if(front==null)
        {
            front=new_node;
            rear=new_node;
        }
        else {
            rear.next=new_node;
            rear=new_node;
        }
    }
    private void deleteElement() {
        if(front==null)
        {
            System.out.println("queue is empty");
        }
        else {
            front=front.next;
        }
    }

    private void displayQueue() {
        Node ptr=front;
        while (ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    public static void main(String Args[])
    {
        Queue_using_linkedlist list= new Queue_using_linkedlist();
        Scanner sc= new Scanner(System.in);
        int n=0;
        while (n!=-1)
        {
            System.out.println("enter 1 for adding a node");
            System.out.println("enter 2 for deleting a node");
            System.out.println("enter 3 for printing queue");
            System.out.println("enter 4 for exit");
            n=sc.nextInt();
            switch (n)
            {
                case 1:{
                    System.out.println("enter element");
                    list.addElement(sc.nextInt());
                    break;
                }
                case 2:{
                    list.deleteElement();
                    break;
                }
                case 3:{
                    list.displayQueue();
                    break;
                }
                case -1:{
                    break;
                }
            }
        }

    }



}
