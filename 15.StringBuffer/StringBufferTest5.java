/*
 void setCharAt(int where,char ch)
*/ 
class StringBufferTest5
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("I am not smart");
        System.out.println(s);
        s.setCharAt(7,'w');
        System.out.println(s);
    }
}
 