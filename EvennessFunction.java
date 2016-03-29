public class EvennessFunction
{
    public static void main(String[] args)
    {
        for (int a=1; a<=20; a++)
        {
            if (isEven(a)==true && isDivisibleBy3(a)==true)
            {
              System.out.println(a + " <=");
            }
            else if(isEven(a)==true)
            {
                System.out.println(a + " <");
            }
            
            else if(isDivisibleBy3(a)==true)
            {
                System.out.println(a + " =");
            }
           
            
            else
            System.out.println(a);
        }
        
    }
public static boolean isEven(int n)
{
    
    if(n%2==0)
    return true;
    
    else 
    return false;
}

public static boolean isDivisibleBy3(int n)
{
    int b;
    if(n%3==0)
    return true;
    
    else
    return false;
}
}

