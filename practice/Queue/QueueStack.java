import java.util.*;
public class QueueStack{
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> s2 = new Stack<Integer>();
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        while(true)
        {
            int input = s.nextInt();
            if(input == 1)
            {
                int value = s.nextInt();
                add(value);
            }
            else if(input == 2)
            {
                System.out.println(poll());
            }
        }
    }
    static void add(int value)
    {
        s.push(value);
    }
    static int poll()
    {
        
        int temp = 0;
        if(s2.isEmpty())
        {
            if(s1.isEmpty())
            return -1;
            while(!s.isEmpty())
            {
                s2.push(s.pop());
            }
            temp = s2.pop();
        }
        else
        {
            temp = s2.pop();
        }
        return temp;
    }
}