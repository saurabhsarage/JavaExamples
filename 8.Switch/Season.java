class Season
{
   public static void main(String [] args)
   {
        int m = Integer.parseInt(args[0]);
        switch(m)
        {
            case 3 :
            case 4 :
            case 5 : System.out.println("Summer");
                         break;
            case 6 :
            case 7 :
            case 8 : System.out.println("Mansoon");
                         break;
            case 9 :
            case 10 :
            case 11 : System.out.println("Post Mansoon");
                         break;
            case 12 :
            case 1 :
            case 2 : System.out.println("Winter");
                         break;
            default : System.out.println("Invalid month number"); 
        }
   }
}