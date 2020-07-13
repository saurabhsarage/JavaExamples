/*
 StringBuffer append(String str)
 StringBuffer append(int num)
 StringBuffer append(double num)
 StringBuffer append(Object obj)
*/ 
class StringBufferTest6
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("One");
        //  s.append("Two");
        // s.append(3);
        //s.append(45.67);
        s.append("Two").append(3).append(45.67);
        boolean yn = true;
        s.append(yn);
        System.out.println(s);
    }
}
 