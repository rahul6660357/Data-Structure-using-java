import java.util.*;
public class StackQueue{
    //this programme is implementing stacks using queue
    static ArrayDeque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        while(true)
        {
            int input = s.nextInt();
            if(input == 1)//push the value
            {
                int value = s.nextInt();
                push(value);
            }
            else if (input == 2)//pop the value
            {
                System.out.println(pop());
            }
        }
    }
    static void push(int value)
    {
        if(q.isEmpty())
        {
            q.add(value);
            return ;
        }
        ArrayDeque<Integer> q2 = new ArrayDeque<>(q);
        q.clear();
        q.add(value);
        while(!q2.isEmpty())
        {
            q.add(q2.poll());
        }
    }
    static int pop()
    {
        if(!q.isEmpty())
        return q.poll();
        return -1;
    }
}