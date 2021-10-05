
package Basic;

public abstract class Abstract 
{
    public abstract void HH();
    public void God()
    {
        int a=10;
        System.out.println(a);
    }    
}
abstract class Abstract1 extends Abstract
{
    @Override
    public void HH()
    {
        System.out.println("HI");
    }
    @Override
    public void God()
    {
         //super.God();
         System.out.println("Hello");
    }
    public static void main(String[] args) 
    {
        Abstract1 ab=new Abstract1(){};
        ab.HH();      
       // ab.God();
    }        
} 
