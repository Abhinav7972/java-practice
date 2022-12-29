import java.util.Scanner;

public class heirachy extends bank { //main class

    public static void main(String[] args) 
    {
      
      user_account u = new user_account();
      u.bank_name();
      System.out.println("our bank located at :" + bank_country);
      System.out.println(""+ "");
      u.display_user_info();
    }
}

class bank {   //super base class
    static  String bank_country = "INDIA";
    int ac_no;
    int department_details;
    int ifsc_no;
    String branch_name;
 int balance;
    int bank_name() {
        System.out.println("welcome to bank");
        return 0;
    }

}

class admin_account extends bank {  //subclass
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
        System.out.print("enter your branch name :" + "");
        branch_name = b.nextLine();
        System.out.println("your branch details are updated");
        System.out.println(""+"");
        bu = branch_name;
        return 0;
    }

    int disp_info()
    {
        System.out.println("user information as follows :" +"");
        System.out.println("user account number is :" + au);
        System.out.println("user branch details is :" + bu);
        return 0;
    }

}

class user_account extends bank  //sub class
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
