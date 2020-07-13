/*
 void ensureCapacity(int capacity)
*/ 
class StringBufferTest2
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("SGBAU");
        System.out.println("Capacity  :" + s.capacity());
        s.ensureCapacity(100);
        System.out.println("Capacity  :" + s.capacity());
    }
}
 