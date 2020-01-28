package Important;

import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int arr[], int fir, int las)
    {
        if(fir<las)
        {
            int pi= partition(arr, fir, las);
            quicksort(arr, fir,pi-1);
            quicksort(arr, pi+1, las);
        }
    }

    private static int partition(int[] arr, int fir, int las) {

        int pivot = arr[las];
        int i= fir-1;
        for(int j=fir;j< las;j++)
        {
if(arr[j]<= pivot)
{
    i++;
    int temp= arr[i];
    arr[i]= arr[j];
    arr[j]= temp;
}
        }
        int temp= arr[i+1];
        arr[i+1]= arr[las];
        arr[las]= temp;

        return i+1;
    }
    public static void print(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        quicksort(arr, 0, arr.length-1);
        print(arr);
    }
}
