import java.util.Scanner;
public class Refresher2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print(" What is your name: ");
		String name=input.nextLine();
		if (name != "Mitchell"){
			for(int x = 1;x<=10;x++){
			System.out.println(name);
			}
			
		}
		int e = 0;
		while(name=="Mitchell" && e <5){
		System.out.println(name);
		e++;	
		}
	}
}