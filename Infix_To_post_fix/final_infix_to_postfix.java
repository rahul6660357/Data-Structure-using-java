package Infix_To_post_fix;

import java.util.Stack;

public class final_infix_to_postfix {
    static int pre(char c){
        switch (c){
            case '+':
            case '-':
            {
                return 1;

            }
            case '/':
            case '*':{
                return 2;
            }
            case '^':{
                return 3;
            }
        }
        return -1;
    }

    static String infixtopostfix(String str) {
        String res= new String("");
        Stack<Character> st= new Stack();
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {
                res+=ch;
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                while (!st.isEmpty() && st.peek()!='(')
                {
                    res+=st.pop();
                }
                    if(!st.isEmpty() && st.peek()!='(')
                    {
                        return "invalid expression";
                    }
                    else
                    st.pop();
            }
            else {
                while (!st.isEmpty() && pre(ch) <=pre(st.peek())){
                    if(st.peek()=='(')
                    {
                        return "invalid statement";
                    }
                    res+=st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty())
        {
            if(st.peek()=='(')
            {
                return "invalid statememnt";
            }
            res+=st.pop();
        }
        return res;
    }

    public static void main(String Args[])
    {
        String str="a+b*(c^d-e)^(f+g*h)-i";
        System.out.print(infixtopostfix(str));
    }


}
