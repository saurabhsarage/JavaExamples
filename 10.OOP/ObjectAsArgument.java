class MyData
{
  int x,y,z;
  void setData(int a,int b,int c)
  {
     x=a;
     y=b;
     z=c;
  }
  void displayData()
  {
     System.out.println("x="+x+"\ty="+y+"\tz="+z);
  }

  void add(MyData t1,MyData t2)
  {
     x = t1.x + t2.x;
     y = t1.y + t2.y;
     z = t1.z + t2.z;
  }
}

class ObjectAsArgument
{
  public static void main(String [] args)
  {
      MyData obj1,obj2,obj3;
      obj1 = new MyData();
      obj2 = new MyData();
      obj3 = new MyData();
 
      obj1.setData(55,44,65);
      obj2.setData(29,42,75);
   
      obj3.add(obj1,obj2);

      obj1.displayData();
      obj2.displayData();
      obj3.displayData();

  }
}