package Control;
import java.util.Scanner;
public class Railway 
{
    public static void main(String args[])
    {
    int num;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Seat Numner");
    num=sc.nextInt();
    int a=num%3;
    if(a==1)
            System.out.println("Upper");
    else if(a==2)
            System.out.println("Lower");
    else if(a==0)
            System.out.println("Middle");
    }    
}
