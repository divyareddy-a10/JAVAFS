package DAY5;

import java.time.LocalDate;
import java.util.*;

public class warrantyCal {
	public static LocalDate getExpiryDate(LocalDate purchaseDate,int warrantymon)
	{
		return purchaseDate.plusMonths(warrantymon);
	}

public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter purchase Date (dddd-mm-dd):");
	LocalDate purchaseDate = LocalDate.parse(s.nextLine());
	System.out.println("Enter warranty period :");
	int months =s.nextInt();
	LocalDate expiryDate=getExpiryDate(purchaseDate,months);
	System.out.println("Warranty Expiry Date:"+expiryDate);
}
}

