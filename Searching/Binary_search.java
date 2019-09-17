package Searching;

import java.util.Scanner;

public class Binary_search {
    private static int Binary_Search(int[] arr, int i, int n, int m)
    {
        int start=i;
        int last=n;
        int med=i+n/2;
        if(arr[med]==m)
        {
            return med;
        }
        else if(arr[med]<m){
            start=med+1;
          return   Binary_Search(arr,start,last,m);
        }
        else {
            last=med-1;
            return Binary_Search(arr,start,last,m);
        }


    }
    public static void main(String Args[])
    {
        System.out.println("enter the number of elements you want tot enter");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number you want to search");
        int m;
        m= sc.nextInt();
        int f=Binary_Search(arr,0,n,m);
        if(f==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("element is found at"+f+"index");
        }
    }
}
