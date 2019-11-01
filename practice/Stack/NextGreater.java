import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class stack
{
  int a[];
  int top;
  stack()
  {
  	a = new int[1000];
    top = -1;
  }
  void push(int i)
  {
    top++;
    a[top] = i;
  }
  int pop()
  {
    if(isEmpty())
      return -1;
    int temp = a[top];
    top--;
    return temp;
  }
  boolean isEmpty()
  {
    if(top == -1)
    {
      return true;
    }
    else
      return false;
  }
  int top()
  {
    if(top == -1)
    {
      return -1;
    }
    else
      return a[top];
  }
}
public class NextGreater
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for(int j=0;j<t;j++)
    {
      int n = s.nextInt();
      int arr[] = new int[n];
      stack mystack = new stack();
      int hash[] = new int[10000];
      for(int i=0;i<n;i++)
      {
        arr[i] = s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(mystack.isEmpty())
        {
          mystack.push(arr[i]);
        }
        else if(mystack.top()>arr[i])
        {
          mystack.push(arr[i]);
        }
        else if(arr[i]>mystack.top())
        {
          while(arr[i]>mystack.top()&&!mystack.isEmpty())
          {
            hash[mystack.pop()] = arr[i];
          }
          mystack.push(arr[i]);
        }
      }
      while(!mystack.isEmpty())
      {
        hash[mystack.pop()] = -1;
      }
      for(int i=0;i<arr.length-1;i++)
      {
        System.out.print(hash[arr[i]] + " ");
      }
      System.out.print(hash[arr[arr.length-1]]);
      System.out.println();
    }
  }
}