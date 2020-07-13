class Sample
{
   int x,y,z;
   Sample( int a,int b,int c)
   {
     this.x = a;
     this.y = b;
     this.z = c;
   } 
    void show()
    {
        System.out.println("x="+this.x+"\ty="+this.y+"\tz="+this.z);  
    }   
}


class ThisTest1
{
   public static void main(String [] args)
   {
         Sample s1 = new Sample(43,23,55);
         Sample s2 = new Sample(65,13,87);
         s1.show();
         s2.show(); 
   }
}