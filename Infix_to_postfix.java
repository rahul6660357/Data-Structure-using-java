import java.util.Stack;

public class Infix_to_postfix {
    static int Pre(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    static String infixtopostfix(String str) {
        Stack<Character> st= new Stack();
        String res= new String("");
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res+=ch;
            }
            else if(ch=='(') {
                st.push('(');

            }
            else  if(ch==')')
            {
                while(!st.empty() && st.peek()!='(' )
                {
                    res+=st.pop();
                }
                if(!st.empty() && st.peek()!='(')
                {
                    return "invalid expression3";
                }
                else {
                    st.pop();
                }
            }
            else {
                while(!st.isEmpty() && Pre(ch) <= Pre(st.peek()))
                {
                    if(st.peek()=='(')
                    {
                        return "invalid expression2";
                    }
                    else {
                        res+=st.pop();
                    }
                }
            }
            st.push(ch);
            while (!st.isEmpty()){
                if(st.peek() == '(')
                    return "Invalid Expression1";
                res += st.pop();
            }

        }

        return res;
    }
    public static void main(String Args[])
    {
        String str="a+b*(c^d-e)^(f+g*h)-i";
        System.out.print(infixtopostfix(str));
    }


}
