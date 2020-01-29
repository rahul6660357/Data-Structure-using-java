package Important;

import java.util.Scanner;

public class HeapSort {
    public static  void heapsort(int arr[])
    {
       int i= (arr.length-2)/2;
       while(i>=0)
       {
           heapify(arr, i--, arr.length);
       }

    }
    public static void heapify(int arr[], int i, int n)
    {
        int smallest = i;
        int L= 2*i+1;
        int R= 2*i+2;
        if(L< n && arr[i]> arr[L])
        {
            smallest= L;
        }
         if(R<n && arr[smallest] > arr[R])
        {
            smallest=R;
        }
        if(smallest!=i)
        {
           swap(arr, smallest, i);
            heapify(arr, smallest,n );
        }

    }
    public static void swap(int arr[], int smallest, int i)
    {
        int temp= arr[i];
        arr[i]= arr[smallest];
        arr[smallest]= temp;
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
        System.out.println("Enter the no of elements");
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        heapsort(arr);
        print(arr);
    }
}
