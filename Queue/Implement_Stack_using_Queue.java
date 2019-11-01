package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queue {
    Queue<Integer> queue1= new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    static int cur_size;

    public Implement_Stack_using_Queue() {
        this.cur_size=0;
    }


    private void push(int i) {
        cur_size++;
        queue2.add(i);
        while (!queue1.isEmpty())
        {
            queue2.add(queue1.peek());
            queue1.remove();
        }

        Queue<Integer> q=queue1;
        queue1=queue2;
        queue2=q;
    }
    public int size(){
        return cur_size;
    }
    private int top() {
        if (queue1.isEmpty())
        {
            return -1;
        }
        return queue1.peek();
    }
    public static void main(String Args[])
    {

Implement_Stack_using_Queue st= new Implement_Stack_using_Queue();
st.push(1);
st.push(2);
st.push(3);
System.out.println("current size is"+st.size());
System.out.println(st.top());
st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println("current size is"+st.size());


    }

    private void pop() {
        if (queue1.isEmpty())
        {
return;
        }
        queue1.remove();
        cur_size--;
    }


}
