import java.util.*;
import java.util.Calendar;
class Dates {
public static void main(String args[])
{
	
	Date d1=new Date();
	System.out.println("Date & Time in java " + d1);

	Calendar dateTime=Calendar.getInstance();

System.out.println("Printing Date & Time in different formats " );
System.out.println("%tc\n" + dateTime);
System.out.println("YYYY-MM-DD Format \t %tF\n" + dateTime);
System.out.println("MM-DD-YY Format \t %tD\n" + dateTime);
System.out.println("Time in 12-hour Format \t %tr\n" + dateTime);
System.out.println("Time in 24-hour Format \t %tT\n" + dateTime);
System.out.println("Day of the week \t %tA\n" + dateTime);
System.out.println("Day of the week Three characters \t %ta\n" + dateTime);
System.out.println("Display full name of the month \t %tB\n" + dateTime);

System.out.println("Display short name of the month \t %tb\n" + dateTime);

System.out.println("Display the day of the month \t %td\n" + dateTime);

System.out.println("Display the month with two digits \t %tm\n" + dateTime);





}
}

