import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.println("Birth date (mm dd yyyy)");
		System.out.print("Month:");
		int mm = keyboard.nextInt();
		System.out.print("Day:");
		int dd = keyboard.nextInt();
		System.out.print("Year:");
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm,dd,yyyy));
		
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total,rem,result;
		String date = "";
		boolean lp;
		String mnth;
		//bool lp;//=is_leap(yyyy);

		// bunch of calculations go here
		yy=yyyy-1900;
		
		    result=month_offset(mm);
		    total=(yy/4) + yy + dd + result;
		    
		    lp=is_leap(yyyy);
		    mnth=month_name(mm);
		    
		    if (lp==true && (mnth=="January")) 
		    {
		        total-=1;
		      }
		    else if (lp==true && (mnth=="February")) 
		    {
		        total-=1;
		      }
		      else
		      {
		      total=total;
		  }

		  rem=total%7;
		date = WeekdayName(rem) + ", "+ month_name(mm) + " "+ dd +", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	public static String WeekdayName( int rem )
	{
	      String day;
		// Your code goes in here.
		if(rem==1)
		    day="Sunday";
		else if(rem==2)
		    day= "Monday";
		else if(rem==3)
		    day= "Tuesday";
		else if(rem==4)
		    day= "Wednesday";
		else if(rem==5)
		    day= "Thursday";
		else if(rem==6)
		    day= "Friday";
		else if(rem==7)
		    day= "Saturday";
		
		else 
		     day ="error";
		     
		     return day;
		     
		  }
	
	public static String month_name( int month )
	{
		String mnth;
		// Your code goes in here.
		if(month==1)
		    mnth="January";
		else if(month==2)
		    mnth= "February";
		else if(month==3)
		    mnth= "March";
		else if(month==4)
		    mnth= "April";
		else if(month==5)
		    mnth= "May";
		else if(month==6)
		    mnth= "June";
		else if(month==7)
		    mnth= "July";
		else if(month==8)
		    mnth= "August";
		else if(month==9)
		    mnth= "September";
		else if(month==10)
		    mnth= "October";  
		else if(month==11)
		    mnth= "November";
		else if(month==12)
		    mnth= "December";
		else 
		     mnth ="error";
		     
		     return mnth;
		     
		  }
	
	public static int month_offset( int mm )
	{
		int result;
		// Your code goes in here.
		if(mm==1)
		    result=1;
		else if(mm==2)
		    result= 4;
		else if(mm==3)
		    result= 4;
		else if(mm==4)
		    result= 0;
		else if(mm==5)
		    result= 2;
		else if(mm==6)
		    result= 5;
		else if(mm==7)
		    result= 0;
		else if(mm==8)
		    result= 3;
		else if(mm==9)
		    result= 6;
		else if(mm==10)
		    result= 1;  
		else if(mm==11)
		    result= 4;
		else if(mm==12)
		    result= 6;
		else 
		     result =-1;
		
		return result;
	}
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean lp;

		if ( year%400 == 0 )
			lp = true;
		else if ( year%100 == 0 )
			lp = false;
		else if ( year%4 == 0 )
			lp = true;
		else
			lp = false;
		
		return lp;
	}
}
