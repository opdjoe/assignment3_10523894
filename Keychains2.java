import java.util.Scanner;
public class Keychains2{
      
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        int choice,a,b,c,d,e,f,num=0;
        int cost= num*10;
        System.out.println("Keychain Shop\n");
        
        do
        {
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout\n");
        
        System.out.print("Please enter your choice: ");
        choice=kb.nextInt();
        System.out.println();
        
        if (choice==1)
        {
            add_keychains(choice);
            System.out.println();
        }
        
        else if (choice==2)
        {
            remove_keychains(choice);
            System.out.println();
        }
        
         else if (choice==3)
        {
            view_order(choice,d);
            System.out.println();
        }
        
        
    }
       while (choice!=4);
    
       
        if (choice==4)
        {
            checkout(e,f);
        }
    }

    public static int add_keychains(int add)
{    int kc, num;
    Scanner kb=new Scanner(System.in);
    System.out.println("You have " + num + " keychains. How many to add?");
     kc=kb.nextInt();
     num=num+kc;
     return num;
}

public static int remove_keychains(int rem)
{ int kc, num;
    Scanner kb=new Scanner(System.in);
    System.out.println("You have " + num + " keychains. How many to remove?");
     kc=kb.nextInt();
     num=num-kc;
     return num;
}

public static void view_order(int c, int d)
{  int num,cost;
    System.out.println("You have " + num + " keychains." );
    System.out.println("Keychains cost $10 each" );
    System.out.println("Total cost is $" + cost );
}

public static void checkout(int e, int f)
{
    int cost;
    String lname;
    Scanner kb=new Scanner(System.in);
    System.out.println("CHECKOUT\n");
    
    System.out.print("What is your name?");
    kb.next();
    System.out.println("You have "+ "keychains.");
    System.out.println("Keychains cost $10 each." );
    System.out.println("Total cost is $" + cost+ ".");
    System.out.println("Thanks for your order, " + lname);
}

}

