package Important;

import java.util.Scanner;

public class InsertionSort {
    public static void IntersectionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
           for(int j=i;j>0;j--)
           {
               if(arr[j]<arr[j-1])
               {
                   int temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]= temp;
               }
           }
        }
        print(arr);
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the no. of elements");
        n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        IntersectionSort(arr);

    }
}
