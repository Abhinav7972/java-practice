

public class returnar
 {
    static int [] arget()
    {
        return  new int []{1,2,3,4};
    }
    public static void main(String[] args) 
    {
        int ar[] = arget();
        for (int i = 0; i < ar.length; i++) 
        {
            System.out.print(ar[i] +"  ");
            
        }
        
    }
    
}
