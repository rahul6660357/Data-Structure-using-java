class Sumk{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8};
        int hash[] = new int[1000];
        for(int i=0;i<1000;i++)
        hash[i] = 0;
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            hash[a[i]]++;
        }
        int sum = 10;
        for(int i=0;i<a.length;i++)
        {
            count += hash[sum-a[i]];
            if(2*a[i] == sum)
            count--;
        }
        System.out.println(count/2);
    }
}