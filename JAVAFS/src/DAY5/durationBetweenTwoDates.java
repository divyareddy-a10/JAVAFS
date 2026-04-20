package DAY5;

	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Scanner;
	public class durationBetweenTwoDates {
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter StartDate (yyyy-mm-dd): ");
			LocalDate date1=LocalDate.parse(s.nextLine());
			System.out.println("Enter EndDate (yyyy-mm-dd): ");
			LocalDate date2=LocalDate.parse(s.nextLine());
			Period p=Period.between(date1,date2);
			System.out.println("Days:"+p.getDays());
			System.out.println("Months:"+p.getMonths());
			System.out.println("Years:"+p.getYears());
		}
	}

