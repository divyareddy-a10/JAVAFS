package DAY5;

import java.time.LocalDate;
import java.time.Period;

import DAY2.Person;


public class modifyPersonDetails extends Person{
	
	
	int calAge(int year,int month,int day)
	{
		LocalDate dob=LocalDate.of(year, month, day);
		return Period.between(dob, LocalDate.now()).getYears();
	}
	
	String getFullName()
	{
		return getFname()+" "+getLname();
	}
	
	void display(int year,int month,int day)
	{
		System.out.println("FullName:"+getFullName());
		System.out.println("Age:"+calAge(year,month,day));
	}
	
	public static void main(String[] args)
	{
		modifyPersonDetails m=new modifyPersonDetails();
		m.setFname("Divya");
		m.setLname("Bharathi");
		m.display(2000,8, 03);
		
	}

}
