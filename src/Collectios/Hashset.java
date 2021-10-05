package Collectios;

import java.util.HashSet;
import java.util.Set;

public class Hashset 
{
    public static void main(String[] args)
    {
        Set js=new HashSet();
        js.add(10);
        js.add("hi");
        js.add(js);
        
        System.out.println(js);  
        System.out.println(js.remove(2));
    }
    
}
