import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Option_Menu extends Account{
    Scanner Menu_input = new Scanner(System.in);
    DecimalFormat mony_Format = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data = new HashMap<>();

    public void get_Login() throws IOException {
        int x = 1;
        do {
            try {
                data.put(15267, 6897);

                System.out.println("Welcome Citi ATM.");
                System.out.println("==================================================================");
                System.out.println("Please Enter Account Number : ");
                setCusomerNumber(Menu_input.nextInt());

                System.out.println("Please Enter PIN number : ");
                setPinNumber(Menu_input.nextInt());


            } catch (Exception e) {
                System.out.println("\n" + "Invalid Charters. Only Numbers are allowed." + "/n");
                x = 2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else {
                System.out.println("Invalid Customer Details..! :( ");
            }
        } while (x == 1);
    }

    public void getAccountType(){
        System.out.println("Select Account Type...");
        System.out.println("Type 1 - Saving Account");
        System.out.println("Type 2 - Checking Account");
        System.out.println("Type 3 - Exit");

        int select = Menu_input.nextInt();
        switch (select) {
            case 1:
                getSavingAccount();
                break;
            case 2:
                getCheckingAccount();
                break;
            case 3:
                System.out.println("Your current transaction is end..! Thank you for using citi bank ATM.. :)");
                break;
        }
    }

    public void getSavingAccount(){

        System.out.println("Saving Account.");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Amount");
        System.out.println("Type 3 - Deposit Amount");
        System.out.println("Type 4 - Exit");

        int select = Menu_input.nextInt();
        switch (select){
            case 1:
                System.out.println("Saving Account Balance : " + mony_Format.format(getSaving_Balance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Your current transaction is end..! Thank you for using citi bank ATM.. :)");
            default:
                System.out.println("Invalid Option Selected");
        }

    }

    public void getCheckingAccount(){
        System.out.println("Checking Account.");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Amount");
        System.out.println("Type 3 - Deposit Amount");
        System.out.println("Type 4 - Exit");

        int select = Menu_input.nextInt();
        switch (select){
            case 1:
                System.out.println("Checking Account Balance : " + mony_Format.format(getChecking_Balance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Your current transaction is end..! Thank you for using citi bank ATM.. :)");
            default:
                System.out.println("Invalid Option Selected");
        }
    }
}
