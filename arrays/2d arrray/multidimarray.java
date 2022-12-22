

public class multidimarray
 {
    public static void main(String[] args)
     {
        int arm[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("printing location of arrays");
        System.out.println("");
        System.out.println(arm[0][0]);
        System.out.println(arm[0][1]);
        System.out.println(" ");
        System.out.println("printing all element of array");
         for (int i = 0; i < arm.length; i++) 
         {

            for (int j = 0; j < arm.length; j++) 
            {
                System.out.print(arm[i][j] + "  ");                
            }
         System.out.println("");
         }
    }
    
}
