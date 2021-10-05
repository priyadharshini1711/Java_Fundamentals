 
package Method;

public class Methods 
{
    static public void test()
    {
        System.out.println("this is static block");
    }
    public void test1()
    {
        System.out.println("this is concrete block");
    }
    public void test1(String x)
    {
        System.out.println("this is the integer method");
        test();
    }
    public static void main(String args[])
    {
        Methods m=new Methods();
        test();
        m.test1();
        m.test1("Jas");
    }  
}
