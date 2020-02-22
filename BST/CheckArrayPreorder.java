package BST;

import java.util.Scanner;
import java.util.Stack;

public class CheckArrayPreorder {
    public static boolean check(int arr[])
    {
        int root= Integer.MIN_VALUE;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]< root)
            {
                return false;
            }

            while(!st.isEmpty() && st.peek()< arr[i])
            {
                root= st.pop();

            }
            st.push(arr[i]);
        }
        return  true;
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(check(arr));
    }
}
