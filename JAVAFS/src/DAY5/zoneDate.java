package DAY5;

import java.time.*;
import java.util.Scanner;

public class zoneDate {
 public static void printDateTime(String zone)
 {
	 ZoneId zoneId=ZoneId.of(zone);
	 ZonedDateTime z = ZonedDateTime.now(zoneId);
	 System.out.println("Date and Time in "+zone+":"+z);
	 
 }
 
 public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter zoneId: ");
	 String zone=s.nextLine();
	 printDateTime(zone);
 }
}
