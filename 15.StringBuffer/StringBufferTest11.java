/*
 StringBuffer replace(int startIndex,int endIndex,String str)
*/ 
class StringBufferTest11
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("This is a test");
        s.replace(5,7,"was");
        System.out.println(s);
    }
}
 