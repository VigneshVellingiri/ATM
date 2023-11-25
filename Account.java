import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customer_Number;
    private int Pin_Number;
    private double checking_Balance = 0;
    private double saving_Balance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat mony_Format = new DecimalFormat("'$'###,##0.00");

    public int setCusomerNumber(int customer_Number){
        this.customer_Number = customer_Number;
        return customer_Number;
    }

    public int getCustomerNumber(){
        return customer_Number;
    }

    public int setPinNumber(int Pin_Number){
        this.Pin_Number = Pin_Number;
        return Pin_Number;

    }

    public int getPinNumber(){
        return Pin_Number;
    }

    public double getSaving_Balance(){
        return saving_Balance;
    }
    public double getChecking_Balance(){
        return checking_Balance;
    }

    public double calcSavingWithdraw( double amount){
        saving_Balance = (saving_Balance - amount );
        return  saving_Balance;
    }
    public double calcCheckingWithdraw(double amount){
        checking_Balance = (checking_Balance - amount);
        return checking_Balance;
    }

    public double calcSavingDeposit(double amount){

        saving_Balance = (saving_Balance + amount);
        return saving_Balance;
    }

    public double calcChechingDeposit(double amount){
        checking_Balance = (checking_Balance + amount);
        return checking_Balance;
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving account balance : " + mony_Format.format(saving_Balance));
        System.out.print("Enter amount : ");

        double amount = input.nextDouble();

        if((saving_Balance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("Available balance : " + saving_Balance);
        }else{
            System.out.println("insufficiant account balance.");
        }
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking account balance : " + mony_Format.format(checking_Balance));
        System.out.print("Enter amount : ");

        double amount = input.nextDouble();

        if((checking_Balance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("Available balance : " + checking_Balance);
        }else{
            System.out.println("insufficiant account balance.");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving account balance : " + mony_Format.format(saving_Balance));
        System.out.print("Enter amount : ");

        double amount = input.nextDouble();

        if((saving_Balance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("Available balance : " + checking_Balance);
        }else{
            System.out.println("Enter valid amount");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking account balance : " + mony_Format.format(checking_Balance));
        System.out.print("Enter amount : ");

        double amount = input.nextDouble();

        if((checking_Balance + amount) >= 0){
            calcChechingDeposit(amount);
            System.out.println("Available balance : " + checking_Balance);
        }else{
            System.out.println("insufficiant account balance.");
        }
    }
}
