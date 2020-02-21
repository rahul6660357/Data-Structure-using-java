package Strings;

import java.util.Scanner;

public class PositionOfVowels {
    public static void printpos(String str)
    {
        char ch[]= str.toCharArray();
        for(int i=1;i<ch.length-1;i++)
        {
            if(ch[i-1]=='a'||ch[i-1]=='e'||ch[i-1]=='i'||ch[i-1]=='o'||ch[i-1]=='u'&& ch[i+1]=='a'||ch[i+1]=='e'||ch[i+1]=='i'||ch[i+1]=='o'||ch[i+1]=='u')
            {
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        printpos(str);
    }
}
