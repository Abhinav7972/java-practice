

 interface in1
{
 void print();
 int  alpha =50;
}


interface in2 extends in1
{
    int add1 =10;
    int add2 =20;
 
}

class derinter implements in2
{

    public void print()
    {
     int sum;
     sum = add1 + add2;
     System.out.println(sum + alpha);
    }

}

public class exinterface 
{
    public static void main(String[] args) 
    {

        derinter d = new derinter();
        d.print();
        
    }
    
}
