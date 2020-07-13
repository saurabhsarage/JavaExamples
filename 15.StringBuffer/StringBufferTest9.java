/*
 StringBuffer delete(int startIndex,int endIndex)
*/ 
class StringBufferTest9
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("OOP using Java");
        s.delete(4,10);
        System.out.println(s);
    }
}
 