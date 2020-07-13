class A
{
   A(int a)
   {
           System.out.println("a = "+a);
   }
}

class B extends A
{
   B(int a,int b)
   {
        super(a);
        System.out.println("b = "+b);
   }
}

class C extends B
{
   C(int a,int b,int c)
   {
        super(a,b);
        System.out.println("c = "+c);
   }
}
class Inh8
{
   public static void main(String [] args)
   {
         new C(10,20,30);
   }
}