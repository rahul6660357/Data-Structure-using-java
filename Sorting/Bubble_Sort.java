package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    int arr[];
    int size;
    public Bubble_Sort(int n) {
        arr=new int[n];
        this.size=n;
    }
    void scan()
    {
        Scanner sc1= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc1.nextInt();
        }
    }

    void sort() {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp;
                    temp=arr[j];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void printarray() {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String Args[])
    {
        System.out.println("enter the number of elements in array");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Bubble_Sort b= new Bubble_Sort(n);
        b.scan();
        b.sort();
        b.printarray();

    }



}
