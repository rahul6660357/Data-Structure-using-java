package Stack_LinkedList;

import java.util.Scanner;

public class Stack_linkedlist {

    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node top;
   public Stack_linkedlist()
   {
       this.top=null;
   }
    void push(int i) {
Node new_node= new Node(i);
new_node.next=top;
top=new_node;

    }
    void pop() {
       if(top==null)
       {
           System.out.println("stack is empty");
       }
       else{
          top=top.next;
       }


    }
    void display() {
       if(top==null)
       {
           System.out.println("stack is empty");
       }
       else{
           Node temp=top;
           while(temp!=null)
           {
               System.out.println(temp.data+" ");
           temp=temp.next;
           }
       }
    }
    int peek() {
       if(top==null)
       {
           System.out.println("the stack is empty");
       }

       return top.data;
    }

    public static void main(String Args[]) {
        Stack_linkedlist list = new Stack_linkedlist();
        Scanner sc = new Scanner(System.in);
        int n=0;



        while (n != -1) {
            System.out.println("enter 1 for push element");
            System.out.println("enter 2 for pop element");
            System.out.println("enter 3 for display stack ");
            System.out.println("enter -1 for exit");
            System.out.println("enter 5 for peek element");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    list.push(sc.nextInt());
                    break;
                }
                case 2: {
                   list.pop();
                   break;
                }
                case 3: {
                    list.display();
                    break;
                }
                case 5:
                {
                   int last= list.peek();
                   System.out.println("last element is"+last);
                    break;
                }
                case -1:{
                    break;
                }

            }

        }

    }


}
