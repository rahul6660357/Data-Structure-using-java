public class MultipleStack
{
    static int arr[] = new int[100];
    static int top1 = -1;
    static int top2 = 100;

    static void push1(int value)
    {
        top1++;
        if(top1 < top2)
        {
            arr[top1] = value;
        }
        else
        {
            System.out.println("Cannot push any value to this stack");
        }
    }
    static void push2(int value)
    {
        top2--;
        if(top1 < top2)
        {
            arr[top2] = value;
        }
        else
        {
            System.out.println("Cannot push any value to this stack");
        }
    }
    static int pop1()
    {
        if(top1 < 0)
        {
            System.out.println("stack is empty !!");
        }
        int temp = arr[top1];
        top1--;
        return temp;
    }
    static int pop2()
    {
        if(top2>99)
        {
            System.out.println("stack is empty !!");
        }
        int temp = arr[top2];
        top2++;
        return temp;
    }
    public static void main(String[] args)
    {
        push1(5);
        push1(6);
        push1(7);
        push1(8);
        push2(5);
        push2(6);
        push2(7);
        push2(8);

        System.out.println(pop1());
        System.out.println(pop1());
        System.out.println(pop1());
        System.out.println();
        System.out.println(pop2());
        System.out.println(pop2());
        System.out.println(pop2());
    }
}