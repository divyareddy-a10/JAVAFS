package DAY6;

import java.util.*;

public class ArrayString {
	public static void main(String[] args)
	{
		//String[] a= {"Mobile","Watch","Laptop","Television","Refridgerator","Air Conditioner"};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of products:");
		int n=s.nextInt();
		s.nextLine();
		System.out.println("Enter products:");
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextLine();
		}
		
		Arrays.sort(a);
		System.out.println("Sorted products:");
		for(String j:a)
		{
			System.out.println(j);
		}
	}
}
