class Sample
{
   int x,y;
   static int z;
   Sample(int x,int y ,int z)
   {
       this.x = x;
       this.y = y;
       this.z = z;
   }

   void display()
   {
       System.out.println("x="+x+"\ty="+y+"\tz="+z);
   }
  static void displayZ()
  {
      System.out.println("Common data :"+z);
  }
}
class Static1
{
    public static void main(String []args)
   {
        Sample s1 = new Sample(10,20,30);
        Sample s2 = new Sample(40,50,60);
        Sample s3 = new Sample(70,80,90);

        s1.display();
        s2.display();
        s3.display(); 

       Sample.displayZ();
   }
}
