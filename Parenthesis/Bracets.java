package Parenthesis;

import java.util.Stack;

public class Bracets {
    static boolean bracketsbalance(String str) {
        Stack<Character> st= new Stack();
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);

            if(ch=='{' || ch=='(' || ch=='[')
            {
                st.push(ch);

            }
            else if(!st.isEmpty()&& ch=='}' && st.peek()=='{' || !st.isEmpty()&& ch==')' && st.peek()=='(' || !st.isEmpty()&& ch==']' && st.peek()=='[')
            {
                st.pop();
            }
            else  {
                return false;
            }
        }
if (st.isEmpty())
{
    return true;
}
else return false;
    }

    public static void main(String args[]) {
        String str = "[(])";
        if (bracketsbalance(str)) {
            System.out.println("balanced");
        }
        else {
            System.out.println("unbalanced");
        }
    }


}
