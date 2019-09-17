package Queue;

import java.util.Scanner;

public class Circular_Queue_array {
int arr[];
int size;
int front,rear;
    public Circular_Queue_array(int size) {
        arr=new int[size];
        this.size=size;
        rear=front=-1;
    }

    private void enqueue(int d) {
        if(isFull()) {
            System.out.println("queue is full");
        }
        else {

            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == arr.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = d;
        }
    }

    private boolean isFull() {
        if(front==0 && rear==arr.length-1 || rear+1==front)
        {
            return true;
        }
        return false;
    }

    private void dequeue() {
        if(isEmpty())
        {
            System.out.println("queue is empty");
        }
        else if(rear==front)
        {
            rear=front=-1;

        }
        else {
            front++;
        }
    }

    private boolean isEmpty() {
        if(rear==-1)
        {
            return true;
        }
        return false;
    }

    private void display() {
        if(rear<front)
        {
            for(int i=0;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
            for(int j=front;j<arr.length;j++)
            {
                System.out.println(arr[j]);
            }
        }
        else {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of your array");
        int size;
        size=sc.nextInt();
        Circular_Queue_array queue=new Circular_Queue_array(size);
        int n = 0;
        while (n != -1) {


            System.out.println("enter 1 for add element");
            System.out.println("enter 2 for delete element");
            System.out.println("enter 3 for print queue");
            System.out.println("enter 4 for exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                {
                    System.out.println("enter element");
                    queue.enqueue(sc.nextInt());
                    break;
                }
                case 2:{
                    queue.dequeue();
                    break;
                }
                case 3:{
                    queue.display();
                }
                case -1:{
                    break;
                }
            }

        }
    }



}
