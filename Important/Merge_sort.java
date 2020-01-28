package Important;

import java.util.Scanner;

public class Merge_sort {
    public static void merge(int arr[], int fir, int mid, int las)
    {
        int n1 = mid- fir+1;
        int n2= las-mid;

        int L[]= new int[n1];
        int R[]= new int[n2];
        for(int i=0;i< n1;i++)
        {
            L[i]= arr[fir+i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i]= arr[mid+i+1];
        }
        int i=0, j=0, k=fir;
        while(i< n1 && j< n2)
        {
            if(L[i]<= R[j])
            {
                arr[k]= L[i];
                i++;
            }
            else if(R[j]<L[i])
            {
                arr[k]= R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]= L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]= R[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int arr[], int fir, int las)
    {
        if(fir< las) {
            int mid = (fir + las) / 2;
            mergesort(arr, fir, mid );
            mergesort(arr, mid+1, las);

            merge(arr, fir, mid, las);
        }

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
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}
