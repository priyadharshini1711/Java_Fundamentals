package Array;

public class ArrayAddition 
{
    static
            {
                String js = "Psalm";
                System.out.println(js.length());
            }
    public static void main(String[] args) 
    {
        int a[][] = new int [2][2];
        int b[][] = new int [2][2];
        int c[][] = new int [2][2];
        int i,j;
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        b[0][0]=1;
        b[0][1]=2;
        b[1][0]=3;
        b[1][1]=4;
        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
                c[i][j]=a[i][j]+b[i][j];
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("["+c[i][j]+"]"+" ");
            }
            System.out.println();
        }        
    }    
}
