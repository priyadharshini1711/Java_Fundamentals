package FlowControl;

public class Sample 
{
    public static void main(String[] args) 
    {
        int i=1;
        for(i=1;i<10;i++)
        {
           
            if(i==5)
            {
                i--;
            }
            else 
                System.out.println(i);
        }         
    }    
}
