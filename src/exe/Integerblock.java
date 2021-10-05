package exe;

public class Integerblock 
{
    public int M()
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
        return 0;
    }
    public static void main(String[] args) 
    {
        int s=10;
        System.out.println(s);
        Integerblock i=new Integerblock();
        i.M();
    }    
}
