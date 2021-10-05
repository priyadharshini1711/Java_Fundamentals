package IF;

public interface Interface 
{
    public void HH();
    public void MM();    
    int x=10;
}
abstract class kk implements Interface
{
    public void HH()
    {
        System.out.println("jj");
    }
    public static void main(String[] args)
    {
        
        
        System.out.println(x);
    }
}