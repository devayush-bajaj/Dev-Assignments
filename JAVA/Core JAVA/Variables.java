package DAY_2;

public class Variables {

    static int Account_no = 1828305;            //Static variable
    int withdraw_amt(){
         int User_cash_withdraw = 10000;        //Local Variable
         return User_cash_withdraw;
    }

    public static void main(String[] args) {
        int balance = 50000;                    //Instance variable
        System.out.println("Account Number :" + Account_no );
        System.out.println("User Withdrawal amount" + new Variables().withdraw_amt() );
        System.out.println("Account Number :" + Account_no );
        System.out.println("Balance :" + balance );
    }

}
