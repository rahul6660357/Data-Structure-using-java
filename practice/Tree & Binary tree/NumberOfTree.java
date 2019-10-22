public class NumberOfTree{
    public static void main(String[] args){
        int[] n = new int[6];
        n[0] = n[1] = 1;
        for(int i=2;i<=5;i++)
        {
            n[i] = 0;
            for(int j=0;j<i;j++)
            {
                n[i] += n[j]*n[i-j-1];
            }
        }

        for(int i=0;i<6;i++)
        {
            System.out.println(n[i]);
        }
    }
}