package exe;

import java.io.FileInputStream;

public class Fileexception 
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream f=new FileInputStream("D:\\hi.txt");
            System.out.println("This is ouput Stream");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("the file is not found");            
        }        
    }    
}
