package Strings;

import java.util.Scanner;

public class PermutationsofString {
    public static void permutation(String str)
    {
        permutation("",str);
    }
    public static void permutation(String perm, String str)
    {
      if(str.isEmpty())
      {
          System.out.println(perm+str);
      }
      else{
          for(int i=0;i<str.length();i++)
          {
              permutation(perm+str.charAt(i), str.substring(0,i)+str.substring(i+1,str.length()));
          }
      }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();

        permutation(str);
    }
}
