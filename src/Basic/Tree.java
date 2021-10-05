 
package Basic;
 
public class Tree
{
    static int m;
    public Tree()
    {
        System.out.println("this is the constructor");
    }
    {
        System.out.println("hi");        
    }
    static
    {
        System.out.println("hello world");
    }
    public void add()
    {
        System.out.println("this is addition block");
    }
    public void add(int x)
    {
        System.out.println("this is the overloaded function");
    }
    static public void subtraction()
    {
        System.out.println("This is the subtraction block");
    }
    public static void main(String[] args)
    {
        Tree t=new Tree();
        t.add();
        t.add(20);
        subtraction();
        m=10;  
        System.out.println(m);
    }    
}
