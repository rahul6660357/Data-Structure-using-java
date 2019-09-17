package Queue;

import java.util.Scanner;

public class Queue_Implementation {
    int front, rear;
    int arr[];
    int size;

    public Queue_Implementation(int n) {
        arr=new int[n];
        this.size=n;
        rear=front=-1;
    }

    private void enqueue(int d) {
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
        }
        else if(isFull())
        {
            System.out.println("queue is full");
        }
        else {
            rear++;
        }
        arr[rear]=d;
    }

    private boolean isFull() {
        if(rear==arr.length-1)
        {
            return true;
        }
        return false;
    }
    private void display() {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    private void dequeue() {
        if(front==-1)
        {
            System.out.println("queue is empty");
        }
        else if(front==rear)
        {
            front=rear=-1;
        }

        front++;
    }
    public static void main(String args[])
    {
 System.out.println("enter the number of elements in queue");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Queue_Implementation queue = new Queue_Implementation(n);
        for(int i=0;i<n;i++)
        {
            queue.enqueue(sc.nextInt());
        }
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(6);
    }




}
