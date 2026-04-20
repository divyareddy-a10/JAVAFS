package DAY5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class acceptDate {
	public static void main(String[] args) {
		
		System.out.println("Enter Date");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		LocalDate u=LocalDate.parse(a);
		LocalDate currentDate=LocalDate.now();
		Period p=Period.between(u,currentDate);
		System.out.println("Days:"+p.getDays());
		System.out.println("Months:"+p.getMonths());
		System.out.println("Years:"+p.getYears());
	}
}