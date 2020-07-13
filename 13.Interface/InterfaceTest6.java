interface Exam
{
    void getExamData(int seatno ,int[] marks );
    void process();
    void putExamData();
}

class Student
{
    String name;
    String branch;
    int sem;
    int roll;
   void getStudentData(int roll,String name,String branch,int sem)
   {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
   }
  void putStudentData()
  {
        System.out.println("Student name      :"+name);
        System.out.println("Roll number        :"+roll);
        System.out.println("Branch                 :"+branch);
        System.out.println("Semester              :"+sem);
  }
}
class MarkList extends Student implements Exam
{
    int seatno;
    int marks[];
    int total;
    float percent;
    public void getExamData(int seatno, int [] marks)
   {
       this.seatno = seatno;
       this.marks = marks;
   }
   public void process()
   {
        total = 0;
        for(int m: marks)
            total+=m;
        percent = (float) total/marks.length;
   }
    public void putExamData()
    {
         System.out.println("Exam seat number      :"+seatno);
         System.out.println("Obtained marks  :");
         for(int i =0 ; i< marks.length;i++)
               System.out.println("Subject "+(i+1)+" : "+marks[i]);
         System.out.println("Total marks             :"+total);
         System.out.println("Percentage              :"+percent);
    }      
}

class InterfaceTest6
{
   public static void main(String [] args)
   {
       MarkList m = new MarkList();
       m.getStudentData(10,"Yogesh","IT",5);
       int [] marks = {76,81,91,100,82};
       m.getExamData(3012,marks);
       m.process();
       m.putStudentData();
       m.putExamData();
   }
}