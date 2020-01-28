package Important;

import java.util.Scanner;

public class MergeSort {
    public  static void merge(int arr[], int f, int mid, int l)
    {
        int n1= mid-f+1;
        int n2= l-mid;
        int L[]= new int[n1];
        int R[]= new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i]= arr[f+i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i]= arr[mid+1+i];
        }
        int i=0,j=0;
        int k=f;
        while(i<n1 && j<n2)
        {
            if(L[i]<= R[j])
            {
                arr[k]= L[i];
                i++;
            }
            else if(L[i]>R[j])
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
    public static void Mergesort(int arr[], int f, int l)
    {
        if(f<l) {
            int mid = (f + l) / 2;
            Mergesort(arr, f, mid);
            Mergesort(arr, mid + 1, l);

            merge(arr, f, mid, l);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] Args)
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

        Mergesort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
