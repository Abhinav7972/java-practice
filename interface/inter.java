interface sample
{
    int alpha = 1;
    int beta =2;
}


class interder implements sample
{
    int intdr()
    {
        int omega;
        omega = alpha*beta;
        System.out.println("first interface element is " + alpha);
        System.out.println("second interface element is " + beta);
        System.out.println("multiplication of interface elements is" +omega);
        return 0;
    }
}


public class inter implements sample 
{
    public static void main(String[] args)
     {
        int sigma;
        sigma = alpha+beta;
        System.out.println("interface in main class");
        System.out.println(sigma);
        interder i = new interder();
        System.out.println("interface in other class");
        i.intdr();

        
    }
    
}
