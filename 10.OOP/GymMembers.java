class GymMember
{
   String name;
   double weight,height,bmi;

   void setData(String nm,double wt,double ht)
   {
     name = nm;
     weight = wt;
     height = ht;
   } 

   void processBMI()
   {
      bmi = weight/(height*height);
   }
  
   void display()
   {
       System.out.printf("%-20s\t%.3f\t%.3f\t%.3f\n",name,weight,height,bmi);
   }
}
class GymMembers
{
  public static void main(String [] args)
  {
     GymMember m[] = new GymMember[3];
     for(int i=0;i<m.length;i++)
        m[i] = new GymMember();

     m[0].setData("Akshay",78.9,1.99);
     m[1].setData("Yogesh",55,1.6);
     m[2].setData("Parag",75.5,1.8);

     for(int i=0;i<m.length;i++)
        m[i].processBMI();

     for(int i=0;i<m.length;i++)
        m[i].display();
  }
}