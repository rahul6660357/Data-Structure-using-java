package DataStructure_class;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Bucket_Sorting {

    private static void BucketSortArray(int[] arr) {

        int bucket[][]=new int[10][arr.length];
     //   Queue<Integer> queue=new Queue();
        int x=findmaxcount(arr);
        for(int j=0;j<x;j++)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]%10==0)
                {

                }
            }
        }
    }
    private static int findmaxcount(int[] arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int count=0;
        while(max<0)
        {
            max=max/10;
            count++;
        }
        return count;
    }

    public static void main(String Args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number of elements in array");
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        BucketSortArray(arr);
    }

}
