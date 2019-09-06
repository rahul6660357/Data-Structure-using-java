package DataStructure_class;

import java.util.Scanner;

public class Selection_Sort {
    int arr[];
    int size;
    Scanner sc1= new Scanner(System.in);

    public Selection_Sort(int n) {
    this.arr=new int[n];
    this.size=n;
    }
void scan()
{
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc1.nextInt();
    }
}
void Selection_sort()
{
for(int i=0;i<arr.length-1;i++)
{
    int index=i;
    for(int j=i+1;j<arr.length;j++)
    {
        if(arr[j]>arr[index])
        {
            index=j;
        }
    }
    int temp=arr[index];
    arr[index]=arr[i];
    arr[i]=temp;

    for(int i1=0;i1<arr.length;i1++)
    {
        System.out.print(arr[i1]+" ");
    }
    System.out.println();
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
        System.out.print("enter the number of elements in a array");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Selection_Sort ss= new Selection_Sort(n);
        ss.scan();
        ss.Selection_sort();
     //   ss.display();


    }
}
