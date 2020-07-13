 interface Sample
 {
     final int A=10;
     final int B = 20;
     final int C = 30;
     void first();
     void second();
     void third();
 }

 class SampleTest implements Sample
 {
     public void first()
     {
          System.out.println("First value :"+A);
     }   
     public void second()
     {
          System.out.println("Second value :"+B);
     }   
     public void third()
     {
          System.out.println("Third value :"+C);
     }   
 }
class InterfaceTest2
{
    public static void main(String args[]) 
    {
        SampleTest st = new SampleTest();     
        st.first();
        st.second();
        st.third(); 
    }
}