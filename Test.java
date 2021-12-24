class  A{

    public void hey(int a)
    {
        System.out.println("AAA" + a);
    }
}

class B extends A {

    int _a;
    public B(int a)
    {
        _a = a;
        //super(5);
    }
    /** 
    @Override
    public void hey(int b)
    {
        System.out.println("BBB" + b);
    }
    */
}

    
public class Test{
    public static void main(String[] args)
    {
        A a = new B(5);
        a.hey(5);
        //B b = new A();
        System.out.println(a +" "  /** + a._a**/);
    }
}
