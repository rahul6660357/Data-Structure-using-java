public class QuickSort{
    public static void main(String[] args)
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static void quicksort(int arr[],int start,int end)
    {
        if(start<=end)
        {
            int pIndex = partition(arr, start, end);
            quicksort(arr,start,pIndex-1);
            quicksort(arr,pIndex+1,end);
        }
    }

    static int partition(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<=pivot)
            {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;

                pIndex++;
            }
        }

        int temp = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;

        return pIndex;
    }
}