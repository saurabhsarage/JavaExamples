class Person
{
    String name ;
    int age;
    String contact_no;

     void setData(String name, int age,String contact_no)
     {
          this.name = name;
          this.age = age;
          this.contact_no = contact_no;
     }
    void display()
   {
         System.out.println("Name                   : "+name);
         System.out.println("Age                      : "+age);
         System.out.println("Contact number : "+contact_no); 
   }
}
class Employee extends Person
{
     String department;
     String designation;
     double basic_salary;

     void setData(String name, int age,String contact_no,String dept,String desg,double sal)
     {
         super.setData(name,age,contact_no);
         department = dept;
         designation = desg;
         basic_salary = sal;      
     }

    void display()
    {   
         super.display();
         System.out.println("Department           : "+department);
         System.out.println("Designation           : "+designation);
         System.out.println("Basic Salary          : "+basic_salary);        
    }      
} 

class Inh3
{
    public static void main(String [] args)
    {
        Employee emp = new Employee();
        emp.setData("Nitin Wankar",41,"239850","IT","Programmer",45000);
        emp.display();
    }
}