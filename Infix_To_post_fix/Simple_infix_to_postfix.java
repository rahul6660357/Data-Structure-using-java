package Infix_To_post_fix;

import java.util.Stack;

public class Simple_infix_to_postfix {
    static int pre(char c){
        switch (c)
        {
            case '+':
            case '-':{
                return 1;
            }
            case '*':
            case '/':{
                return 2;
            }
            case '^':
            {
                return 3;
            }
        }
        return -1;
    }
    static String changetopostfix(String str) {
        Stack<Character> st= new Stack();
        String res= new String("");
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res+=ch;
            }
            else if(st.isEmpty())
            {
                st.push(ch);
            }
            else {
                while (!st.isEmpty() && pre(ch)<= pre(st.peek()))
                {
                 res+=st.pop();
                }
                st.push(ch);
            }

        }
        while (!st.isEmpty())
        {
            res+=st.pop();
        }
        return res;
    }
    public static void main(String Args[])
    {
        String str="1+2*4/5-7+3/6";
        System.out.print(changetopostfix(str));
    }


}
