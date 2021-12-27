package Programs;

import static java.lang.Character.isUpperCase;
import java.util.Scanner;

public class Name
{
    public static void main(String[] args) 
    {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        int x,i,a=0,e=0,j=0,o=0,u=0;
        x=name.length();
        name = name.toLowerCase();
        for(i=0;i<x;i++)
        {
            if(name.charAt(i)=='a')
                a++;
            else if(name.charAt(i)=='e')
                e++;
            else if(name.charAt(i)=='i')
                j++;                
            else if(name.charAt(i)=='o')
                o++;
            else if(name.charAt(i)=='u')
                u++;       
        }
        System.out.println("a:"+ a);
        System.out.println("e:"+ e);
        System.out.println("i:"+ j);
        System.out.println("o:"+ 0);
        System.out.println("u:"+ u);
    }
}

/*
output:
samplename
a:2
e:2
i:0
o:0
u:0
*/