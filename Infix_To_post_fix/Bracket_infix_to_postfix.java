package Infix_To_post_fix;

import java.util.Stack;

public class Bracket_infix_to_postfix {
//    static int pre( char c){
//        switch (c){
//            case '+':
//            case '-':{
//                return 1;
//            }
//            case '*':
//            case '/':{
//                return 2;
//            }
//            case '^':
//            {
//                return 3;
//            }
//
//        }
//        return -1;
//    }
//    static String infixtopostfix(String str) {
//    String res= new String("");
//        Stack<Character> st= new Stack();
//    for(int i=0;i<str.length();i++)
//    {
//        char ch= str.charAt(i);
//
//        if (Character.isLetterOrDigit(ch)){
//            res+=ch;
//        }
//        else  if(ch=='(')
//        {
//            st.push(ch);
//        }
//        else if(ch==')')
//        {
//            while (!st.isEmpty() && st.peek()!='('){
//                res+=st.pop();
//            }
//            if (!st.isEmpty() && st.peek()!='(')
//            {
//                return "invalid expression";
//            }
//            else {
//                st.pop();
//            }
//        }
//        else
//            while (!st.isEmpty()&& pre(ch)< pre(st.peek()))
//        {
//            if (st.peek()=='(')
//                return "invalid expression";
//                st.pop();
//
//        }
//        st.push(ch);
//
//
//    }
//        while (!st.isEmpty()){
//
//            res += st.pop();
//        }
//        return res;
//    }
//    public static void main(String Args[])
//    {
//        String str="a+b*(c^d-e)^(f+g*h)-i";
//        System.out.print(infixtopostfix(str));
//    }



    static int Prec(char ch)
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

    // The main method that converts given infix expression
    // to postfix expression.
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')', pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                    if(stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    // Driver method
    public static void main(String[] args)
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }

}
