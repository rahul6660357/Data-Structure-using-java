package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void reverse(String str)
    {
        int first=0;

        char ch[]= str.toCharArray();
        int last=ch.length-1;
        for(first=0;first<last;first++,last--)
        {
            if(ch[first]==' ')
            {
                first++;
            }
            if(ch[last]==' ')
            {
                last--;
            }
            if(ch[first]!=' ' && ch[last]!= ' ')
            {
                char temp=ch[first];
                ch[first]= ch[last];
                ch[last]=temp;

            }
        }

       System.out.println(String.valueOf(ch));
    }

    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
    reverse(str);
    }
}
