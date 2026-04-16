package DAY1;

public class EvenorOdd {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		if(a==0)
			System.out.println("Positive Number nor Negative Number");
		else if(a>0)
			System.out.println("Positive Number");
		else
			System.out.println("Negative Number");
	}
}
