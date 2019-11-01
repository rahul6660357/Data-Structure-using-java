package BST;

import java.util.Stack;

public class Queue_Using_Stack {
    Stack<Integer> st1= new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    private void enque(int i) {


        while (!st1.isEmpty())
        {
            st2.push(st1.pop());
        }
        st1.push(i);
        while (!st2.isEmpty())
        {
            st1.push(st2.pop());
        }

    }

    private void deque() {
        while(!st1.isEmpty())
        {
            System.out.println(st1.pop());
        }

    }
    public static void main(String Args[])
    {
        Queue_Using_Stack qq= new Queue_Using_Stack();

        qq.enque(1);
        qq.enque(5);
        qq.enque(8);
        qq.enque(10);
        qq.enque(12);
        qq.enque(15);

        qq.deque();
    }


}
