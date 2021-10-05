package exe;

public class ExceptionHandling 
{
    static
    {
        try
        {
            int a=50/0;
            System.out.println(a);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
        int a=10;
        System.out.println(a);        
    }    
}
