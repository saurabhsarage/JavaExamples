interface One
{
    void method1();
    void method2();
}

interface Two
{
    void method3();
    void method4();    
}

class DemoClass implements One,Two
{
     public void method1() { }
     public void method2() { }
     public void method3() { }
     public void method4() { }
}

class InterfaceTest3
{
    public static void main(String [] args)
    {
        new DemoClass();
    }
}