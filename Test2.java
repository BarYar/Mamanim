class A {

    private int _x;

    public A(int x)  {

        _x = x;

    }

    public int getX()   {

        return _x;

    }

    public int doubleX()  {

        return 2*getX();

    }

    public int tripleX()   {

        return 3*_x;

    }    

    public int subXhelper()  {

        return _x-1;

    }    

    public int subX()  {

        return subXhelper();

    }    

}

//--------------------------------------------------//

class B extends A {

    private int _x;

    public B(int xA, int xB)  {

        super(xA);

        _x = xB;

    }

    public int getX(int a)  {

        return _x + a;

    }

    public int superX()  {

        return super.getX();

    } 

    public int tenTimesX()  {

        return 10*_x;

    }

    public int subXhelper()  {

        return _x-2;

    }    

}

public class Test2{
    public static void main(String[]args)
    {
        A a = new A(1);

        A b = new B(2, 22);

        System.out.println(b.doubleX());
<<<<<<< HEAD
=======
        
        //System.out.println(b.getX(5));
        
        System.out.println(((B)a).tenTimesX()); 
>>>>>>> a7be689 (Add Opal 2)
    }
}