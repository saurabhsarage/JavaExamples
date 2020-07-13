class Product
{
    String discr;
    float rate,amt;
    int qty;
    static float tamt,disc,netamt;
   
    Product(String discr,float rate,int qty)
    {
        this.discr = discr;
        this.rate = rate;
        this.qty = qty;   
    }
   void process()
   {
       amt = rate * qty;
       tamt= tamt+amt;
   }
  static void processFinal()
  {
      disc = tamt*10/100;
      netamt = tamt-disc;
  }
   void display()
  {
      System.out.printf("\n%-30s %10d %12.2f %12.2f",discr,qty,rate,amt);
  }
  static void displayFinal()
  {
       System.out.print("\n-------------------------------------------------------------------------------");
       System.out.printf("\n%54s %12.2f","Total amount :",tamt);
       System.out.printf("\n%54s %12.2f","Discount :",disc);
       System.out.printf("\n%54s %12.2f","Nett amount :",netamt);
       System.out.print("\n-------------------------------------------------------------------------------");
  }
}

class Static2
{
   public static void main(String [] args)
  {
    Product p1 = new Product("HDD-Seagate 1TB",4670.0f,3);
    Product p2 = new Product("Graphics card NVIDIA2gb",6300.0f,4);
    Product p3 = new Product("RAM Tethron 8gb",9500.0f,2);
    p1.process();
    p2.process();
    p3.process();
    p1.display();
    p2.display();
    p3.display();
    Product.processFinal();
    Product.displayFinal(); 
  }
}