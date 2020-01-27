package Important;

import java.util.Scanner;

public class BinarySearch {
    public static int search(int arr[],  int f, int l,int k)
    {
        int mid = (f+l)/2;
        if(arr[mid]== k)
        {
            return mid;
        }
        if(arr[mid]>k)
        {
            return  search(arr, 0, mid-1, k);
        }
        if(arr[mid]<k)
        {
            return  search(arr, mid+1, l, k);
        }
        return  -1;
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
       int x= search(arr, 0, arr.length-1, sc.nextInt());
        if(x== -1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found"+ x);
        }
    }
}
