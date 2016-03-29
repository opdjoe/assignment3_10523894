import java.util.Scanner;
public class ProjectCalculator
{
   
    public static double add()
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to compute respectively");
       double n=input.nextDouble();
        double v=input.nextDouble();
        double b=n+v;
        System.out.printf("%g+%g=%g",n,v,b);
        return b;
    }
    public static double subs()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to compute respectively");
        double n=input.nextDouble();
        double v=input.nextDouble();
        double b=n-v;
         System.out.printf("%g-%g=%g",n,v,b);
        return b;
    }
    public static double div()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to compute respectively");
        double n=input.nextDouble();
        double v=input.nextDouble();
        double b=n/v;
         System.out.printf("%g/%g=%g",n,v,b);
        return b;
    }
    public static double mul()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to compute respectively");
        double n=input.nextDouble();
        double v=input.nextDouble();
        double b=n*v;
         System.out.printf("%g*%g=%g",n,v,b);
        return b;
    }
    public static double exp()
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to compute respectively");
        int d=input.nextInt();
        int v=input.nextInt();
       int b= d^v;
         System.out.printf("%d^%d=%d",d,v,b);
        return b;
    }
    
    public static void main(String[] arg)
    {
         int e=0;
    while(e==0)
    {
        Scanner input = new Scanner(System.in);
         System.out.printf("1)Addition%n2)Subtraction3)Division%n4)Multiplication%n5)Exponential");
        System.out.println("Enter an option");
        int option=input.nextInt();
        if(option==1)
        {
            add();
        }
        else if(option==2)
        {
            subs();
        }
         else if(option==3)
        {
            div();
        }
         else if(option==4)
        {
            mul();
        }
         else if(option==5)
        {
            exp();
        }
    }
}}
