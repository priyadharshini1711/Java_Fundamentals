package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AsciiSecurityParser 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int i;
        int x[]= new int[s.length];
        int maxl=0;
        List<Integer> l=new ArrayList<Integer>();
        for(i=0;i<s.length;i++)
        {
            x[i]=Integer.parseInt(getAscci(s[i]));
            l.add(x[i]);            
        }
        Collections.sort(l);
        for(int j:l)
        {
            for(i=0;i<x.length;i++)
            {
                if(j==x[i])
                {
                    System.out.print(s[i]+"\n");
                    break;
                }
            }
        }
    }
    static String getAscci(String x)
    {
        char a[]=x.toCharArray();
        String c="";
        int i;
        for(i=0;i<a.length;i++)
        {
            c=c+(int)a[i];
        }
        return c;
    }
    
}
