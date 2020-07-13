interface DataWorks
{
    void init();
    void process();
    void display();
}

class Product implements DataWorks
{
    String discription;
    int qty;
    double rate,amt;

    public void init()
   {
         discription = "HDD2TBSeagate";
         qty = 3;
         rate = 7899.0;
   }
    public void process()
   {
         amt = rate*qty;
    }
    public void display()
   {
         System.out.println("Discription   : "+discription);
         System.out.println("Rate              :"+rate);
         System.out.println("Quantity       :"+qty);
         System.out.println("Amount        :"+amt);
   }    
}

class InterfaceTest1
{
   public static void main(String [] args)
   {
        Product p = new Product();
        p.init();
        p.process();
        p.display();
   }
}