class VowelOrConsonent
{
   public static void main(String [] args)
   {
         char ch = args[0].charAt(0);
         if(Character.isLetter(ch))
         {
             
            switch(Character.toUpperCase(ch))
            {
                case 'A':
                case 'E':
                case 'I' :
                case 'O':
                case 'U':  System.out.println(ch+" is a Vowel");
                                 break;
                default : System.out.println(ch+" is a Consonent");
            }  
         }
         else
              System.out.println("Not an alphabet entered");
   }
}