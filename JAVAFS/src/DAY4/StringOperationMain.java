package DAY4;

import java.util.*;

public class StringOperationMain {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringOperations op=new StringOperations();

		System.out.println(op.performOperations(str,1));
		System.out.println(op.performOperations(str,2));
		System.out.println(op.performOperations(str,3));
		System.out.println(op.performOperations(str,4));
		
	}
}
