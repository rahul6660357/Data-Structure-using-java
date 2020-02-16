import java.util.Scanner;

public class StringReverse {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

         checkpalindrome(str);

//        if(b==true)
//        {
//            System.out.println("str is palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }
    }

    private static void checkpalindrome(String str) {
        int i=0;
char ch[]= str.toCharArray();
int j= ch.length-1;
        for(i=0;i<j; i++,j--)
        {
            char temp= ch[i];
            ch[i]= ch[j];
            ch[j]= temp;

        }
        for(char c : ch)
        System.out.print(c);
    }


}
