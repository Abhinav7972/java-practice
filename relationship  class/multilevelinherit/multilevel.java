
import java.util.Scanner;

class school
{
    int g;
   
    int school_name()
    { 
        System.out.println("welcome to alpha male school");
        return 0;
    }
     int total_grade()
    {   System.out.println("enter number of grade");
        Scanner ng = new Scanner(System.in);
        g = ng.nextInt();
        System.out.println("total grade in our school :" +g);
        return 0;
    }

}


class grade extends school
{
   
    int s;
    int total_section()
    {
        int ts;
        ts = g*s;
         System.out.println("total section is :"+ ts);
        return 0;

    }

    int section()
    {
        System.out.print("enter total number of section: ");
        Scanner sn = new Scanner(System.in);
        s = sn.nextInt();
        System.out.println("section per class in our school :"+ s);
        return 0;
    }
       
}

class display extends grade 
{
   display()
   {
    System.out.println("information regarding school will be displayed here :");
   }
}



public class multilevel 
{

    public static void main(String[] args) 
    {  
        display ds = new display();
        ds.school_name();
        ds.total_grade();
        ds.section();
        ds.total_section();
       
    }
}
