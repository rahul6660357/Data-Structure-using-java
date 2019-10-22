public class KMP{
    public static void main(String[] args)
    {
        String str = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        search(pat,str);
    }
    static void search(String pat,String mainStr)
    {
        int lps[] = new int[pat.length()];

        computeLPS(pat,lps);
        int j=0;
        int i=0;
        while(j<mainStr.length())
        {
            if(mainStr.charAt(j) == pat.charAt(i))
            {
                i++;
                j++;
            }
            if(i == pat.length())
            {
                System.out.println("Found " + (j-i));
                i = lps[i-1];
                return ;
            }
            else if(j<mainStr.length() && pat.charAt(i) != mainStr.charAt(j))
            {
                if(i==0)
                {
                    j++;
                }
                else
                {
                    i = lps[i-1];
                }
            }
        }
        System.out.println("Not found");
    }

    static void computeLPS(String pat,int[] lps)
    {
        int len = 0;
        lps[0] = 0;
        int i=1;
        while(i<pat.length())
        {
            if(pat.charAt(i) == pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}