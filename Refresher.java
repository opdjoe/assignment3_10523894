import java.util.Scanner;
public class Refresher{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print(" What is your name: ");
		String name=input.nextLine();
		if (name != "Mitchell"){
			for(int x = 1;x<=10;x++){
			System.out.println(name);
			}
			
		}
		else if(name.equals("Mitchell")){
			for(int y = 1; y<=5;y++){
			System.out.println("Mitchell");
			}
		}
	}
}