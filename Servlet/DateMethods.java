 
import java.util.Calendar;
import java.util.Date;


public class DateMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		System.out.println("Date"+dt.toString());
		System.out.println("Day of Month "+dt.getDate());
		System.out.println("Day of Week "+	dt.getDay());
		System.out.println(" Month "+dt.getMonth());
		System.out.println("Year "+(1900+dt.getYear()));
		System.out.println("Time "+dt.getTime());
		
		Calendar cal;
	
		
	}

}
