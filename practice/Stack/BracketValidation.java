import java.util.*;
public class BracketValidation{
    public static void main(String[] args)
    {
        Stack<Character> s = new Stack<>();
        String str = "()";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(s.isEmpty())
            {
                s.push(str.charAt(i));
            }
            else
            {
                if(ch == ')' || ch == ']' || ch == '}' )
                {
                    char ch2 = s.peek();
                    if(ch2 == '(' || ch2 == '[' || ch2 == '{')
                    {
                        s.pop();
                    }
                }
                else
                s.push(ch);
            }
        }
        System.out.println(s.isEmpty());
    }
}