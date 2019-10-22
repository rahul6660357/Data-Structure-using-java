public class MergeSort{
    public static void main(String[] args)
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergeSort(int arr[],int start,int end)
    {
        //stopping condition
        if(start < end)
        {
            int mid = (end+start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid,end);
        }
        
    }

    static void merge(int arr[],int l,int m,int r)
    {
        int leftlen = m-l+1;
        int rightlen = r-m;

        int left[] = new int[leftlen];
        int right[] = new int[rightlen];

        for(int i=0;i<leftlen;i++)
        left[i] = arr[l+i];

        for(int i=0;i<rightlen;i++)
        right[i] = arr[m+1+i];

        int i=0,j=0,k=l;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length)
        {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}