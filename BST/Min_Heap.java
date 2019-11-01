package BST;

public class Min_Heap {
    int x=0;
    int arr[]= new int[99];

    private void add(int i) {
arr[x]= i;
upheapify(x);
x++;
    }
    private void upheapify(int ci) {
        int pi= (ci-1)/2;
        if(arr[pi]> arr[ci])
        {
            swap(arr[pi], arr[ci]);
            upheapify(pi);
        }
    }
    private void swap(int i, int i1) {
int temp;
temp=arr[i];
arr[i]=arr[i1];
arr[i1]=temp;
    }

    public static void main(String Args[])
    {
        Min_Heap mm= new Min_Heap();
        mm.add(10);
        mm.add(20);
        mm.add(3);
        mm.add(40);
        mm.add(5);
        mm.add(7);
        mm.display();
    }

    private void display() {
        for(int i=0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}
