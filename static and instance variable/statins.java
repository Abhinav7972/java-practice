class statins
{
    int a = 2; //instance variable
    static int b =20; //class static variable


    public static void main(String[] args)
     {
        statins ob1 = new statins();
        statins ob2 = new statins();
        System.out.println(ob1.a); //using instance variable with object
        System.out.println(ob2.a);
        System.out.println(statins.b); //using static var with class name
        System.out.println(ob1.b); //using static var with object name
        System.out.println(ob2.b);
    }
}