package Parenthesis;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis_balance {
    static boolean checkparenthesis(String str) {
        char ch[]=str.toCharArray();
        Stack st= new Stack();
        for(int i=0;i<ch.length;i++)
        {
          if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
          {
              st.push(ch[i]);
          }
            if(ch[i]==')' || ch[i]=='}' || ch[i]==']')
            {

            }

        }
return true;
    }

     static boolean isempty() {
        return false;
    }

    private static void checklast() {
    }

    public static void main(String Args[])
    {
        String str;
        Scanner sc= new Scanner(System.in);
        str=sc.next();
        if(checkparenthesis(str))
        {
            System.out.print("balanced");
        }
        else{
            System.out.print("unbalanced");
        }
    }



}
