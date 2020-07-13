/*
 void setLength(int len)
*/ 
class StringBufferTest3
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("Keep the city clean.");
        System.out.println("String   :" + s);
        System.out.println("Length  :" + s.length());
        s.setLength(30);
        System.out.println("String   :" + s);
        System.out.println("Length  :" + s.length());
        s.setLength(10);
        System.out.println("String   :" + s);
        System.out.println("Length  :" + s.length());
    }
}
 