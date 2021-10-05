package Inheritance;

public class AA
{
    static 
    {
        System.out.println("a");
    }
}
class BB extends AA
{
    static
    {
        System.out.println("b");
    }
}
class CC extends BB
{
    static
    {
        System.out.println("c");
    }
}
class Main
{
    public static void main(String[] args) 
    {
        CC js=new CC();              
    }
}
