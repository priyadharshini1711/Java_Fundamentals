package FlowControl;

public class EnhancedForLoop
{
    public static void main(String[] args) 
    {
        int a[]={10,20,30};
        for(int x:a)
            System.out.println(x);  
        int b[]=new int[10];
        for(int i:b)
        {
            System.out.println("Hello");
        }            
    }    
}
