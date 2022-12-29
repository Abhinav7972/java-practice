
class admin  
{
 int emp_sal = 10;
 void emp_update()
 {
    System.out.println("employee data is updated");
 }

 void sal_update()
 {
    System.out.println("employee salary is updated");
 }
}

class hr extends admin
{
int total_salary;
int emp_no = 100;
void sal_cal()
{
    total_salary = emp_sal * emp_no;
    System.out.println("total salary of employee :"+total_salary); 
    
}

void display()
{
    System.out.println("total number of employees :"+emp_no);
}

}

public class singleinherit
{
    public static void main(String[] args) 
    {
        hr h  = new hr();
        h.display();
        h.emp_update();
        h.sal_cal();
        h.sal_update();
    }
    
}
