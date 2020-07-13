/*
 StringBuffer insert(int index,String str)
 StringBuffer insert(int index,int num)
 StringBuffer insert(int index,double num)
 StringBuffer insert(int index,Object obj)
*/ 
class StringBufferTest7
{
   public static void main(String [] args)
   {
        StringBuffer s = new StringBuffer("I Java");
        s.insert(2,"like ");
        System.out.println(s);
    }
}
 