/*
  StringBuffer()
  StringBuffer(int size)
  StringBuffer(String str)
  int length()
  int capacity()
*/ 
class StringBufferTest1
{
   public static void main(String [] args)
   {
      //  StringBuffer s = new StringBuffer();
      //  StringBuffer s = new StringBuffer(50);
        StringBuffer s = new StringBuffer("SGBAU");
        System.out.println("String    :" + s);
        System.out.println("Length    :" + s.length());
        System.out.println("Capacity  :" + s.capacity());
   }
}
 