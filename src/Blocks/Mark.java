package Blocks;

import java.util.Scanner;

public class Mark 
{
    Mark()
    {
        
    }
    public static void Main()
   {
       System.out.println("True God");
       
   }
    public static void main(String[] args)
    {
        System.out.println("This Is Main Function");
          Mark js = new Mark();
          js.Main();
          js.Jasmine();
        String name;
        int t,e,m,s,ss,total;
        float avg;
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("Enter your Tamil,Englis,Maths,Science,Social marks");
        t=sc.nextInt();
        e=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();
        ss=sc.nextInt();
        total=t+e+m+s+ss;
        avg=total/5;
        System.out.println(name+" ! here is your marklist");
        System.out.println("tamil:"+t);
        System.out.println("english:"+e);
        System.out.println("maths:"+m);
        System.out.println("science:"+s);
        System.out.println("social science:"+ss);
        System.out.println("Total="+total); 
        System.out.println("average="+ avg);    
    }   
   public void Jasmine()
    {
        System.out.println("JASMINE");
    }
   String js;
}
