 
package Variables;

public class Test {
    int m;
    void print()
    {
        m=20;
        System.out.println("Instance Variables : "+m);
    }
    void printauto(int x)
    {
        System.out.println("This is Automatic Variable : "+x);
    }
    static int n;
    public static void main(String args[])
    {
        int x,m=10;
        n=30;
        System.out.println("This Is Static Variable : "+n);
        System.out.println("This Is Main Local Variables : "+m);
        Test t=new Test();
        t.print();
        t.printauto(10);
    }    
}
