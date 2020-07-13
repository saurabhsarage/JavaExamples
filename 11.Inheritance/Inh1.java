class First
{
    void method1()
    {
       System.out.println("Inside Method1()");
    }
    void method2()
    {
       System.out.println("Inside Method2()");
    }
}

class Second extends First
{
    void method3()
    {
       System.out.println("Inside Method3()");
    }
    void method4()
    {
       System.out.println("Inside Method4()");
    }
}
class Inh1
{
    public static void main(String [] args)
    {
        Second obj = new Second();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}