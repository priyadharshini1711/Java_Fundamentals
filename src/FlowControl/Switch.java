package FlowControl;

public class Switch 
{
    {
        int i=10;
        switch(i+1)
        {
            case 10:System.out.println("Hello");
                    break;
            case 10+1+20:System.out.println("hi");
                         break;
            default:System.out.println("default");
                    break;
        }      
    }
    //static
    {
        byte b=10;
        switch(b+1)
        {
            case 11:
                System.out.println("Hi");
                break;
            case 100:
                System.out.println("Hello");
                break;
            case 1000:
                System.out.println("True");
                break;
        }
    }
    static
    {
        int a=10;
        final int b=20;
        switch(a)
        {
            case 10:
                System.out.println("HI");
                break;
            case b:
                System.out.println("Hello");
                break;
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
