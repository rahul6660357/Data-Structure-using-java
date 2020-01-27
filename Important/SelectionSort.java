package Important;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]< arr[min])
                {
                    min= j;
                }
            }
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]=temp;
        }
        printarr(arr);
    }

    public static void printarr(int arr[])
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
System.out.println("enter the no. of elements");
n= sc.nextInt();
int arr[]= new int[n];

for(int i=0;i<n;i++)
{
arr[i]= sc.nextInt();
}

selectionsort(arr);

    }
}
