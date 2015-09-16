import java.util.Calendar;
import java.util.GregorianCalendar;

public class CustomCalendar{
	
	public CustomCalendar() {
		
	}
	
	public void todayDay()
	{   GregorianCalendar custom = new GregorianCalendar();
		int date = custom.get(Calendar.DAY_OF_WEEK);
		String day = realDay(date);
		System.out.println("Today is: " + day);
		
	}
	public void hundreddayfromNow()
	{	GregorianCalendar custom = new GregorianCalendar();
		custom.add(Calendar.DAY_OF_MONTH, 100);
		int date = custom.get(Calendar.DAY_OF_MONTH);
		int dayoftheweek = custom.get(Calendar.DAY_OF_WEEK);
		int monthtemp = custom.get(Calendar.MONTH);
		String month = realMonth(monthtemp);
		String day = realDay(dayoftheweek);
		
		System.out.println("One hundred day from now is the " + date + " of " + month + ", " + day );
	}
	
	public void myBirthday()
	{
		GregorianCalendar myBirthday = new GregorianCalendar(1991, 3, 1);
		int date = myBirthday.get(Calendar.DAY_OF_MONTH);
		int dayoftheweek = myBirthday.get(Calendar.DAY_OF_WEEK);
		int monthtemp = myBirthday.get(Calendar.MONTH);
		int year = myBirthday.get(Calendar.YEAR);
		String month = realMonth(monthtemp);
		String day = realDay(dayoftheweek);
		System.out.println("My birthday is: " + month + ", " + date + ", " + year + ", " + day);
	}
	
	public void tenthousandfromMB()
	{
		GregorianCalendar myBirthday = new GregorianCalendar(1991, 3, 1);
		myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
		int date = myBirthday.get(Calendar.DAY_OF_MONTH);
		int dayoftheweek = myBirthday.get(Calendar.DAY_OF_WEEK);
		int monthtemp = myBirthday.get(Calendar.MONTH);
		int year = myBirthday.get(Calendar.YEAR);
		String month = realMonth(monthtemp);
		String day = realDay(dayoftheweek);
		System.out.println("10000 days from my birthday is " + month + ", " + date + ", " + year + ", " + day);
	}
	private String realMonth(int month)
	{
		switch(month)
		{
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
		return "Error no response";
	}
	private String realDay(int date) {
		switch(date)
		{
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		}
		return "Error no response";
	}

}
