package exe;

public class Stringmethod 
{
    public String M()
    {
        try
        {
            String s=null;
            System.out.println(s.length());
        }
        catch (NullPointerException e )
        {
            System.out.println(e);
        }
        return "jas";     
    }
    public static void main(String[] args)
    {
        Stringmethod s=new Stringmethod();
        s.M();   
        String name="ABC";
        System.out.println(name);
    }
}
