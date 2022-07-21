package DAY_3;

public class TypesOFVariables {

    static int Account_no = 1828305;            //Static variable
    int withdraw_amt(){
         int User_cash_withdraw = 10000;        //Local Variable
         return User_cash_withdraw;
    }

    public static void main(String[] args) {
        int balance = 50000;                    //Instance variable
        System.out.println("Account Number :" + Account_no );
        System.out.println("User Withdrawal amount" + new TypesOFVariables().withdraw_amt() );
        System.out.println("Account Number :" + Account_no );
        System.out.println("Balance :" + balance );
    }

}
