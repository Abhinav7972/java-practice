import java.util.Scanner;

class bank {
    int ac_no;
    int department_details;
    int ifsc_no;
    String branch_name;
    int balance;
    String bank_country = "INDIA";
    int bank_name() {
        System.out.println("welcome to bank");
        return 0;
    }

}

class admin_account extends bank {
    int au;
    String bu;
    int ac_update() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your account details : ");
        ac_no = s.nextInt();
        System.out.println("your account details are updated");
        au = ac_no;
        return 0;
    }


    int branch_update() 
          
    {
        Scanner b = new Scanner(System.in);
        System.out.print("enter your branch name :");
        branch_name = b.nextLine();
        System.out.println("your branch details are updated");
        bu = branch_name;
        return 0;
    }

    int disp_info()
    {
        System.out.println("user account number is :" + au);
        System.out.println("user branch details is :" + bu);
        return 0;
    }

}

class user_account extends bank
{

admin_account ad = new admin_account();        
 int display_user_info()
 {
  ad.ac_update();
  ad.branch_update();
  ad.disp_info();
    return 0;
 }    


}

public class heirachy {

    public static void main(String[] args) 
    {
      
      user_account u = new user_account();
      u.bank_name();
      u.display_user_info();
    }
}
