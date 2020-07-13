interface MyInterface
{
    void method1();
    void method2();
}

class MyClass
{
     void show()
     { System.out.println("Inside MyClass show method"); }
}

class DemoClass extends MyClass implements MyInterface
{
    public void method1()
   { System.out.println("Implementing method1"); }

    public void method2()
   { System.out.println("Implementing method2"); }

}

class InterfaceTest5
{
    public static void main(String [] args)
    {
        DemoClass dc = new DemoClass();
        dc.show();
        dc.method1();
        dc.method2();
    }
}