package Validation;
import static java.lang.System.exit;
import java.util.Scanner;
public class Mail
{
    
    static Scanner sc=new Scanner(System.in);
    static public void login()
    {
        String q1,q2,q3;
        System.out.println("enter your favorite colour");
        q1=sc.next();
        System.out.println("enter your favorite fruit");
        q2=sc.next();
        System.out.println("enter your favorite actor");
        q3=sc.next();
    }
    static public void validatenum(String s)
    {
        if(s.length()==10)
            login();
        else 
        {
            System.out.println("invalid number.reenter number");
            String n1;
            n1=sc.next();
            validatenum(n1);            
        }
    }
    static public void validatepass(String pa,String pa1)
    {
        if(pa.equals(pa1))
            mail(pa);
        else
        {
            System.out.println("reenter password");
            String pa2=sc.next();
            validatepass(pa,pa2);
        }            
    }
    static public void mail(String pa)
    {
        String email,p;
        System.out.println("enter email");
        email=sc.next();
        System.out.println("enter password");
        p=sc.next();
        if(pa.equals(p))
            System.out.println("welocome");
        else 
            login();     
    }
    public static void main(String args[])
    {
        Mail m=new Mail();
        String fname,lname,pass,pass1,num;
        int a;
        System.out.println("Enter your first name");
        fname=sc.next();
        System.out.println("Enter your last name");
        lname=sc.next();
        System.out.println("Enter your password");
        pass=sc.next();
        System.out.println("reenter your password");
        pass1=sc.next();
        validatepass(pass,pass1);
        System.out.println("enter mobile number");
        num=sc.next();
        validatenum(num);
        
    }    
}
