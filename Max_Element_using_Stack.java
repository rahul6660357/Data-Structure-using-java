import java.util.Stack;

public class Max_Element_using_Stack {
    Stack<Integer> st1= new Stack();
    Stack<Integer> trackedStack= new Stack();
    void pushitem(int i) {
        st1.push(i);
        if(st1.size()==1)
        {
            trackedStack.push(i) ;
        }
        else{
            if(i>trackedStack.peek()){
                trackedStack.push(i);

            }
            else{
                trackedStack.push(trackedStack.peek());
            }
        }
    }
    int getmax() {
        return trackedStack.peek();
    }

    public static void main(String Args[])
    {
        Max_Element_using_Stack list= new Max_Element_using_Stack();
        list.pushitem(2);
        list.pushitem(4);
        list.pushitem(9);
        list.pushitem(5);
       int max= list.getmax();
       System.out.println(max);
    }
}
