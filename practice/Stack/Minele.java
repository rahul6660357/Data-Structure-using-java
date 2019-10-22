import java.util.*;
public class Minele{
    static Stack<Integer> s = new Stack<Integer>();
    static int min = -99;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int value = 0;
        while(input != -1)
        {
            input = sc.nextInt();
            if(input == 1)
            {
                value = sc.nextInt();
                push(value);
            }
            else if(input == 2)
            {
                System.out.println("Min Element is = " +min);
            }
            else if(input == 3)
            {
                System.out.println("Element popped out is = " + pop());
            }
        }
    }
    static void push(int value)
    {
        if(s.isEmpty())
        {
            min = value;
            s.push(value);
        }
        else
        {
            if(value < min)
            {
                System.out.println("Incoming value is less than the minimum value so pushing " + (value-min));
                s.push(value-min);
                min = value;
            }
            else
            {
                s.push(value);
            }
        }
    }
    static int pop()
    {
        if(!s.isEmpty())
        {
            int top = s.peek();
            System.out.println("top = " + top);
            if(top>min)
            {
                return s.pop();
            }
            else
            {
                int temp = s.pop();
                int r = min;
                if(temp<min)
                {
                    min = min-temp;
                }
                return r;
            }
        }
        min = -1;
        return -1;
    }
}