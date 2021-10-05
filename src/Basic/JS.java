 
package Basic;

 
public abstract class JS 
{
    public abstract void HH(); 
}

abstract class mine extends JS
{
    //@Override
    public  void HH()
    {
        System.out.println("Hi");
    }
}
class Dummy
{
    public static void main(String[] args)
    {
        mine mm = new mine() {};  
        mm.HH();        
    }
}
