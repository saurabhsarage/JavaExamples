 class Numbers
 {
   int a,b;
   void setData(int a,int b)
   {
      this.a = a;
      this.b = b;  
   }
   void display()
   {
       System.out.println("a = "+a+ " and b = "+b);
   }
 }
 class SwapTest
 {
     public static void main(String [] args)
     {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Numbers obj = new Numbers();
        obj.setData(a,b);
        System.out.println("Before swapping : ");
        obj.display();
        swap(obj);
        System.out.println("After swapping   :");
       obj.display();
     }
    static void swap(Numbers t)
    {
          int temp = t.a;
          t.a = t.b;
          t.b = temp;
    }
  }