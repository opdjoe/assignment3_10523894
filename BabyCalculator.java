import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+")){
				c = a + b;
				System.out.printf("%f + %f = %f \n",a,b,c);
			}
			if(op.equals("-")){
				c = a - b;
				System.out.printf("%f - %f = %f \n",a,b,c);
			}
			else if (op.equals("*")){
				c = a * b;
				System.out.printf("%f * %f = %f \n",a,b,c);
			}
			else if (op.equals("/")){
				c = a / b;
				System.out.printf("%f / %f = %f \n",a,b,c);
			}

		} while ( a!=0 );
	}
}

