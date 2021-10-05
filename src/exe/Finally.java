package exe;

public class Finally 
{
    public static void main(String[] args) 
    {
         try
         {int a[][] = new int[2][2];
         a[0][0]=1;
         a[0][1]=2;
         a[1][0]=3;
         a[1][1]=4;
         System.out.println(a[0][0]);
         System.out.println(a[0][1]);
         System.out.println(a[1][0]);
         System.out.println(a[1][1]);
         System.out.println(a[2][2]);
        }
         catch(ArrayIndexOutOfBoundsException e)
         {
             System.out.println(e);
         }
         finally
         {
             System.out.println("this is final block");
         }
    }    
}
