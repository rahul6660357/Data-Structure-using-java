package Strings;

import java.util.Scanner;

public class ReverseFirstAndLast {
    public static void reversefirstandlast()
    {
        String str ="My name is rahul sharma";
        String token[]= str.split(" ");
        StringBuilder result= new StringBuilder();
        for(int i=0;i<token.length;i++)
        {
            char arr[]= token[i].toCharArray();
            char temp= arr[0];
            arr[0]= arr[token[i].length()-1];
            arr[token[i].length()-1]=temp;
            result.append(String.valueOf(arr));
            if(i!=token.length-1)
            {
                result.append(" ");
            }

        }
        System.out.println(result.toString());
    }
    public static void main(String Args[])
    {
        Scanner scanner= new Scanner(System.in);
      //  String str= scanner.next();
        reversefirstandlast();
    }
}
