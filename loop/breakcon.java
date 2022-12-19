public class breakcon 
{
 
    static void brloop()
    {
        System.out.println("here we will see use of break in  loop");
         for(int i =0; i<=5;i++)
         {
            System.out.println(i);
            if(i==3)
            {
                break;
            }
         }
    }
    
    static void conloop()
    {
        System.out.println("here we will see use of continue in loop");
        for(int i = 0; i<=5;i++)
        {
            System.out.println(i);
            if(i==0)
            {
                continue;
            }

        }

    }

    public static void main(String[] args) 
    {
        brloop();
        conloop();
        
    }
    
}
