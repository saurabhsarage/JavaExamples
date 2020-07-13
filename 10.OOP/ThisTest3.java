class Person
{
   String name ;
   int age;

   Person( String name, int age)
   {
     this.name = name;
     this.age = age;
   } 
    void show()
    {
        System.out.println("Name  :" + name+"\tAge :"+age);  
    }
  
   Person younger(Person t)
   {
       if(age < t.age)
           return this; 
       else
          return t;
   }   
}

class ThisTest3
{
   public static void main(String [] args)
   {
       Person p1 = new Person("Vaibhav",23);
       Person p2 = new Person("Suraj",25);
       Person young = p1.younger(p2);
       System.out.println("Younger person is");
       young.show();
   }
}