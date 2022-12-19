
class base
{

     base()
    {
        System.out.println("its an base");
    }
}


class derive extends base
{
      derive()
    {
        System.out.println("its an derive");

    }


    int der()
    {
        System.out.println("derive is running");
        return 0;
    }
}



public class inherit
 {
 
    public static void main(String[] args) 
    {
     derive d = new derive();
     d.der();    
    }
}
