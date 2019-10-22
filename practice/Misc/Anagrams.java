import java.util.Scanner;

class Anagrams{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int count[]=new int[26];
		for(int i=0;i<s1.length();i++)
			count[s1.charAt(i)-97]++;
		for(int i=0;i<s2.length();i++)
			count[s2.charAt(i)-97]--;
		
		for(int i=0;i<26;i++)
			if(count[i]!=0)
			{
				System.out.println("No");
				System.exit(0);
			}
		System.out.println("Yes");
	}
}