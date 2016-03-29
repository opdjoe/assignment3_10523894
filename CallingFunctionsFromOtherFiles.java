import java.util.Scanner;

public class CallingFunctionsFromOtherFiles
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to AtopaGh fantastic birth-o-meter!");
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
		
		    result=MonthOffset.month_offset(mm);
		    total=(yy/4) + yy + dd + result;
		    
		    lp=WeekdayCalculator.is_leap(yyyy);
		    mnth=MonthName.month_name(mm);
		    
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
		date = WeekdayName.weekday_name(rem) + ", "+ MonthName.month_name(mm) + " "+ dd +", " + yyyy;

		return date;
	}


}
