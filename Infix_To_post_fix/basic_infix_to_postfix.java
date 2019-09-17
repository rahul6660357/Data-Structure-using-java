package Infix_To_post_fix;

import java.util.Stack;

public class basic_infix_to_postfix {
    static int pre(char ch) {
        switch (ch)
        {
            case '+' :
            case '-':{
                return 1;
            }
            case '*':
                case '/':
                {
                    return 2;
                }
            case '^':
            {
                return 3;
            }
        }
        return -1;
    }

    static String infixtopostfix(String str) {

        String res="";
        Stack<Character> st= new Stack();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res+=ch;
            }
            else {
                if(st.isEmpty()){
                   st.push(ch);
                }
                else {
                    while (!st.isEmpty() && pre(ch)<= pre(st.peek()))
                    {
                        res+=st.pop();
                    }
                }
            }
            st.push(ch);
        }
        return res;
    }


    public static void main(String Args[])
    {

        String str="100/10*2+1-3^2";
       System.out.print(infixtopostfix(str));
    }



}
