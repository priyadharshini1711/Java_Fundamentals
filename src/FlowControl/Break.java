
package FlowControl;

public class Break 
{
    static
    {
        /*/for(int i=0;i<10;i++)
        {
           
                 System.out.println(i);
                 break;    
        }/*/
        int i;
        for ( i=0;i<10;i++)
        {
            if(i==5)
            break;
            System.out.println(i);      
            System.out.println("");
        }
          
    }
    public static void main(String[] args) {
        
    }
    
    
}
