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

  MyData add(MyData t2)
  {
     MyData r = new MyData();
     r.x = x + t2.x;
     r.y = y + t2.y;
     r.z = z + t2.z;
     return r; 
  }
}

class ObjectReturning
{
  public static void main(String [] args)
  {
      MyData obj1,obj2,obj3;
      obj1 = new MyData();
      obj2 = new MyData();
      obj3 = new MyData();
 
      obj1.setData(55,44,65);
      obj2.setData(29,42,75);
   
      obj3 = obj1.add(obj2); //object passing to and returning from method  
     
      obj1.displayData();
      obj2.displayData();
      obj3.displayData();
  }
}