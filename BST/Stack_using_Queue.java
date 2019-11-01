package BST;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_Queue {
     static  int cur_size=0;

    public Stack_using_Queue(){
        cur_size=0;

    }
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int i){
        cur_size++;
        q2.add(i);

        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q= q1;
        q1= q2;
        q2=q;
    }

    private int pop() {
        if(q1.isEmpty())
        {
            return 0;
        }
        cur_size--;
       return q1.remove();
    }
    private int findsize() {
    return cur_size;
    }

    public static void main(String Args[]){
Stack_using_Queue ss= new Stack_using_Queue();

ss.push(12);
System.out.println("current size is"+ss.findsize());
System.out.println(ss.top());
ss.push(13);
        System.out.println(ss.top());
ss.push(15);
        System.out.println(ss.top());
System.out.println("poped element is");
System.out.println(ss.pop());
    }

    private int top() {
        return q1.peek();
    }


}
