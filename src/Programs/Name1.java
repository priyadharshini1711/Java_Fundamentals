package Programs;

import java.util.Scanner;

public class Name1 
{
    public static void main(String[] args) 
    {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        int i,j,c;
        for(i=0;i<name.length();i++)
        {
            c=0;
            for(j=0;j<name.length();j++)
            {
                if(name.charAt(i)==name.charAt(j)&&i!=j)
                    c++;
            }
            System.out.println(name.charAt(i)+":"+ ++c);   
            //name.charAt(i)=0;
            
        }
    }
    
}

