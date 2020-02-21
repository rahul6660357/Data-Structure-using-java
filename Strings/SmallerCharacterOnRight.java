package Strings;

import java.util.Scanner;

public class SmallerCharacterOnRight {
    public static void smallercharright(String str)
    {
        char arr[]= str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                  count++;
                }
            }
            System.out.print(count+" ");
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        smallercharright(str);
    }
}
