public class KnapSack{
    public static void main(String[] args)
    {
        int weight[] = {10,20,30};
        int cost[] = {60,100,120};
        int costPerWeight[] = new int[weight.length];

        for(int i=0;i<weight.length;i++)
        {
            costPerWeight[i] = cost[i]/weight[i];
        }
        int n = weight.length;
        int hash[] = new int[100];
        for(int i=0;i<costPerWeight.length;i++)
        {
            hash[costPerWeight[i]] = weight[i];
        }
        int w = 50;
        int maxCost = 0;
        for(int i=hash.length-1;i>=0;i--)
        {
            if(hash[i] == 0)
            continue;
            if(w-hash[i] > 0)
            {
                maxCost += hash[i]*i;
                w = w - hash[i];
            }
            else
            {
                maxCost = maxCost+(w*i);
                break;
            }
        }
        System.out.println(maxCost);
    }
}