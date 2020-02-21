package Strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateWords {
    public static void duplicatewords(String str)
    {
        String arr[]= str.split(" ");
        HashMap<String,Integer> countwords= new HashMap<String, Integer>();

        for(int i=0;i<arr.length;i++)
        {
            if(countwords.containsKey(arr[i].toLowerCase()))
            {
                countwords.put(arr[i].toLowerCase(),countwords.get(arr[i].toLowerCase())+1);
            }
            else{
                countwords.put(arr[i].toLowerCase(),1);
            }
        }

        Set<String> stringSet = countwords.keySet();
        for(String word : stringSet)
        {
            if(countwords.get(word)>1)
            {
                System.out.println(word+" "+ countwords.get(word));
            }
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        duplicatewords(str);
    }
}
