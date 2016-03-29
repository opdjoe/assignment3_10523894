import java .util.Scanner;

public class AreaCalculator{
	public static void main(String []args){
		System.out.println("Shape Area Calculator version \n") ;
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- ");
		System.out.println("1) Triangle\n2) Rectangle\n3)Square\n4)Circle\n5)Quit");

		Scanner input = new Scanner (System.in);
		int s,l,w,b,h,r;
		int choice;
		choice = input.nextInt();		
		if (choice == 1){
			System.out.print("Base: ");
			b = input.nextInt();
			System.out.print("Height: ");
			h = input.nextInt();
			System.out.println("The area is "+ area_triangle(b,h));
		}
		else if (choice == 2){
			System.out.print("Length: ");
			l = input.nextInt();
			System.out.print("width: ");
			w = input.nextInt();
			System.out.println("The area is "+ area_rectangle(l,w));
		}
		else if (choice == 3){
			System.out.print("Side: ");
			s = input.nextInt();
			System.out.println("The area is "+ area_square(s));
		}
		else if (choice == 4){
			System.out.print("Radius: ");
			r = input.nextInt();
			System.out.println("The area is "+ area_cicle(r));
		}
		else 
			System.out.println("GoodBye.");
	}
	public static double area_cicle(int radius){
		double A = Math.PI * Math.pow(radius,2);
		return A;
	}
	public static int area_rectangle( int length, int width )
	{
		int A = length * width;
		return A;
	}
public static int area_square( int side )
	{
	int A = side * side ;
	return A;
	}
public static double area_triangle( int base, int height )
	{
	double A  = 0.5 * base * height;
	return A;
	}
}