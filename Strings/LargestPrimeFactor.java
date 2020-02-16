package Strings;

import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       int i=  largestprime(number);
       System.out.println(i);
    }
    public static int largestprime(int number)
    {
        int max = Integer.MIN_VALUE;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                max= i;
                if(i>max)
                {
                    max=i;
                }
                if(max==Integer.MIN_VALUE)
                {
                    max=number;
                }
            }
        }
        return max;
    }
}
