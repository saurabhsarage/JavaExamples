class Sample
{
  int x,y,z;
  int sum;

  void setData(int a,int b,int c)
  {
    x=a;y=b;z=c;
  }
  void process()
  {
     sum = x+y+z;
  }
  void putData()
  {
     System.out.println("x="+x+"\ty="+y+"\tz="+z+"\tSum="+sum);
  }
}
class MultipleObjects
{
  public static void main(String [] args)
  {
      Sample s1 = new Sample();
      Sample s2 = new Sample();
      Sample s3 = new Sample();
      s1.setData(43,55,23);
      s2.setData(98,10,78);
      s3.setData(65,88,42);
      s1.process();
      s2.process();
      s3.process();
      s1.putData();
      s2.putData();
      s3.putData();
  }
}