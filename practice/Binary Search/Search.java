class Search{
    public boolean searchTheKey(Node root,int key)
    {
        if(root == null)
        return false;
        boolean lsearch = false;
        boolean rsearch = false;
        if(key < root.data)
        {
            lsearch = searchTheKey(root.leftChild, key);
        }
        else if(key > root.data)
        {
            rsearch = searchTheKey(root.rightChild, key);
        }
        else
        {
            return true;
        }

        return lsearch || rsearch;
    }

    public boolean searchTheKey(int arr[],int l,int r,int key)
    {
        int left = l;
        int right = r;
        while(left < right)
        {
            int mid = (right+left)/2;
            if(key < arr[mid])
            {
                right = mid - 1;
                continue;
            }
            else if(key > arr[mid])
            {
                left = mid+1;
                continue;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}