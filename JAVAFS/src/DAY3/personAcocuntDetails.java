package DAY3;

public class personAcocuntDetails {
	public static void main(String[] args)
	{
		personDetails pd1=new personDetails("Smith",25);
		personDetails pd2=new personDetails("Kathy",29);
		
		AccountDetails ac1=new AccountDetails(pd1,2000);
		AccountDetails ac2=new AccountDetails(pd2,3000);
		
		ac1.deposit(2000);
		ac2.withdraw(2000);
		
		System.out.println("Updated Detaills\n");
		System.out.println(ac1);
		System.out.println(ac2);
		
	}

}
