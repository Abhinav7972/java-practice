
abstract class engine
{
 abstract void ignition();
}

class car extends engine 
{
    void ignition()
    {
        System.out.println("car engine is starting");
    }

}

class bike extends engine
{
    void ignition()
    {
       System.out.println("bike engine is starting");
    }

}


public class absclass 
{

 public static void main(String [] args)
 {
car c = new car();
bike b = new bike();
c.ignition();
b.ignition();

 }    
}