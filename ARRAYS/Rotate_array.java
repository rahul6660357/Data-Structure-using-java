package ARRAYS;

import java.util.Scanner;

public class Rotate_array {
    static void Rotatearray(int[] arr, int m) {
        for(int i=0;i<m;i++)
        {
            int x=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];

            }
            arr[arr.length-1]=x;
        }
    }

    public static void main(String Args[])
    {
        System.out.println("enter the number of elements in your array");
        Scanner sc= new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number of rotations ");
        int m;
        m=sc.nextInt();
        Rotatearray(arr, m);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}
