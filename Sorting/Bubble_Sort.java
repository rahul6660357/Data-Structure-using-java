package DataStructure_class;

import java.util.Scanner;

public class Bubble_Sort {
    int arr[];
    int size;
    Scanner sc1= new Scanner(System.in);
    public Bubble_Sort(int n) {
arr= new int[n];
this.size=n;
    }
    void scan() {
        for(int i=0;i<arr.length;i++)

            arr[i]=sc1.nextInt();
    }
void sort()
{
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length;j++)
    {
        if(arr[i]<arr[j])
        {
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
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
        System.out.print("enter the number of elements in array");
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        Bubble_Sort bb= new Bubble_Sort(n);
        bb.scan();
        bb.sort();
        bb.display();
    }



}
