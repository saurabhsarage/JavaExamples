class Student
{
    private String name;
    private int roll;
          
     void setData(String name,int roll)
     {
          this.name = name;
          this.roll = roll;
     }
    
    void display()
    {
        System.out.println("Name            :"+name);
        System.out.println("Roll number :"+roll);
    }
}

class Exam extends Student
{
   protected int [] marks;
   
   void setData(String name,int roll,int mrk[])
   {
       super.setData(name,roll);
       marks = mrk;
   }
  void display()
  {
        super.display();
        System.out.println("Obtained marks ");
        for(int i=0;i<5;i++)
           System.out.println("Subject "+(i+1) +" :"+marks[i]);
  }
}

class Result extends Exam
{
     int total;
     float percent; 
     void process()
     {
           total = 0;
           for(int i=0;i<5;i++)
               total += marks[i];
  
           percent = total/5.0f;      
     }
   void display()
   {
       super.display();
       System.out.println("Total marks     :"+total);
       System.out.println("Percentage       :"+percent);  
   }
}
class Inh4
{
   public static void main(String [] args)
   {
           String name = "Akshay Dhok";
           int roll = 1234;
           int [] marks = {99,95,98,92,90};

          Result obj = new Result();
          obj.setData(name,roll,marks);
          obj.process();
          obj.display(); 
   }
}