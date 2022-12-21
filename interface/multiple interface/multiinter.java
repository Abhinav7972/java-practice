interface inter1
{
    int mulvar1 =5;
    int mulvar2 =5;
}


interface inter2
{
int addvar1 =5;
int addvar2 =5;
}


class interderive implements inter1,inter2
{
    int intadd()
    {
     int add;
     add = addvar1 + addvar2;
     System.out.println("first addition value is " + addvar1);
     System.out.println("second addition value is "+ addvar2);
     System.out.println( "addition is  " +add);

        return 0;
    }


    int intmul()
    {
        int mul;
        mul = mulvar1 * mulvar2;
        System.out.println("first multiplication value is " + mulvar1);
        System.out.println("second multiplication value is " +mulvar2);
        System.out.println("multiplication is "+mul);
        return 0;
    }
}



public class multiinter 
{
public static void main(String[] args)
 {
   interderive i = new interderive();
   i.intadd();
   i.intmul();    
}
    
}
