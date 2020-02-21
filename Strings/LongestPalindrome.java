package Strings;

import java.util.Scanner;

public class LongestPalindrome {
    public static void longestpalindrome(String str)
    {
        int n= str.length();
        boolean table[][]= new boolean[n][n];

        int maxLength=1;
        for(int i=0;i<n;i++)
        {
            table[i][i]= true;
        }
        int start=0;
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)== str.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1;
                if(table[i+1][j-1] && str.charAt(i)== str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        maxLength = k;
                        start = i;
                    }
                }
            }
        }
       printpalindrome(str,start, start+maxLength-1);

    }
    public static void printpalindrome(String str, int start, int last)
    {


            System.out.print(str.substring(start,last+1));


    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
       longestpalindrome(str);
    }
}
