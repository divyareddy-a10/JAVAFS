package DAY4;

import java.util.*;

public class positiveStringMain {
public static void main(String[] args)
{
	positiveString ps=new positiveString();
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if(ps.isPositive(s))
		System.out.println("True,It is positive String");
	else
		System.out.println("False,It is not a positive String");
	
}
}
