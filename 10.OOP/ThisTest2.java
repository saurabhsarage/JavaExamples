class Sample
{
   int x,y,z;
   Sample( int x,int y,int z)
   {
     this.x = x;
     this.y = y;
     this.z = z;
   } 
    void show()
    {
        System.out.println("x="+x+"\ty="+y+"\tz="+z);  
    }   
}


class ThisTest2
{
   public static void main(String [] args)
   {
         Sample s1 = new Sample(43,23,55);
         Sample s2 = new Sample(65,13,87);
         s1.show();
         s2.show(); 
   }
}