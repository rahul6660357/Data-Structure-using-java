package ARRAYS;

import java.util.Scanner;

public class merge_two_sorted_array {
    static void mergearray(int[] arr1, int[] arr2) {
        int arr3[]= new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
               arr3[k]=arr1[i];
               k++;
               i++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<arr1.length)
        {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length)
        {
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for(int k1=0;k1<arr1.length+arr2.length;k1++)
        {
            System.out.print(arr3[k1]+" ");
        }
    }
    public static void main(String Args[])
    {
        System.out.println("enter the number of elements in array one");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the number of elements in array second");
        int n2;
        n2=sc.nextInt();
        int arr2[]= new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        mergearray(arr1,arr2);
    }


}
