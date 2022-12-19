
public class parameterclass 
{
    public static void main(String[] args)
     {

        add a = new add();
        a.addition(10, 20);

        subtract l = new subtract();
        l.Subtraction(10,20);
    }
    
}


class add
{

int addition(int a,int b)
{
    int sum = a+b;
System.out.println("addition is :"+  sum); 
return 0; 

}
}

class subtract
{

    int Subtraction(int c,int d)
    {
        int sub = c-d;
     System.out.println("Subtraction is" + (sub));
        return 0;
    }
}


