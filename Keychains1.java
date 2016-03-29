import java.util.Scanner;
public class Keychains1{
      
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        int choice;
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
            add_keychains();
            System.out.println();
        }
        
        else if (choice==2)
        {
            remove_keychains();
            System.out.println();
        }
        
         else if (choice==3)
        {
            view_order();
            System.out.println();
        }
        
        
    }
       while (choice!=4);
    
       
        if (choice==4)
        {
            checkout();
        }
    }

    public static void add_keychains()
{
    System.out.println("ADD KEYCHAINS");
}

public static void remove_keychains()
{
    System.out.println("REMOVE KEYCHAINS");
}

public static void view_order()
{
    System.out.println("VIEW ORDER");
}

public static void checkout()
{
    System.out.println("CHECKOUT");
}

}

