package FlowControl;

public class Iterative
{
    /*/static
    {
         int i = 0;
         
         for(System.out.println("HI");i<10;i++)
         {
         }
    }
    static 
    {
        final int x=0;
        for(System.out.println("HI");x<10;x++)
        {
            System.out.println("HELLO");
        }
    }/*/
    public static void main(String[] args)
    {
        /*/int i=0;
        for(System.out.println("HI");;i++)
        {
            System.out.println("Hello"+ i);
        }
        int x=0;
        for(System.out.println("HI");x<10;x++)
        {
            System.out.println("HELLO");
        }/*/
        int i=0;
        for(System.out.println("HI");i<10;System.out.println("HELLO"))
        {
            
        }
    }
    
}
