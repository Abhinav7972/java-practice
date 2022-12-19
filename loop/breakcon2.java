public class breakcon2
 {
   public static void main(String[] args)
    {
        int i;
      

        for(i = 0; i <=10;i++)
        {
            System.out.println("at start of loop :"+i);
            if(i==5)
            {
                break;

            }
            else
            {
                continue;
            }
        }
        System.out.println("at end of loop :"+i);
    
   }
    
}
