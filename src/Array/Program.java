package Array;

import java.util.Scanner;

public class Program 
{
    public static void main(String[] args) 
    {
        String name;
        Scanner sc=new Scanner(System.in);
        int i,j,x;
        name=sc.next();
        x=name.length();
        int k=0;
        for(i=0;i<x;i++,k++)
        {
            for(j=0;j<x-i-1;j++)
                System.out.print(" ");
            for(j=x-i-1;j<x;j++)
                System.out.print(name.charAt(k));
                System.out.println();
        }
    }
    
}
