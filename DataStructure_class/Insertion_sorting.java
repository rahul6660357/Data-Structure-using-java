package DataStructure_class;

import java.util.Scanner;

public class Insertion_sorting {
    int arr[];
    int size;
    Scanner sc1= new Scanner(System.in);
    public Insertion_sorting(int n) {
    this.arr= new int[n];
    this.size=n;
    }
    void scan()
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc1.nextInt();
        }
    }
    void Insertion_sort(){
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    void display()
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
        System.out.println("enter the number of elements in your array");
        n=sc.nextInt();
        Insertion_sorting ii= new Insertion_sorting(n);
    ii.scan();
    ii.Insertion_sort();
    ii.display();
    }
}
