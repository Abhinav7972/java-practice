class construct
{
    public static void main(String[] args)
     {
    mkcons m = new mkcons();
    m.conmethod();    
    }
}


class mkcons
{
mkcons()
{
    System.out.println("its an constructor");
}

int conmethod()
{
    System.out.println("its an method");
    return 0;
}
}



