import bankAccount.*;
import java.util.*;
public class MainScreen {
    public MainScreen(String Name, String ID, String Branch) {
        Scanner scanner = new Scanner(System.in);

        //BankLogin obj = new BankLogin();
        Bank obj = new Bank(); //package


        char option= '\0';

       do {
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("Welcome " +Name.toUpperCase());
            System.out.println("Your Account Number is " +ID);
            System.out.println("Branch "+Branch.toUpperCase());
            System.out.println("A : Check Your Balance");
            System.out.println("B : Deposit");
            System.out.println("C : Withdraw");
            System.out.println("D : Previous Transaction");
            System.out.println("E : Exit The System");
            System.out.print("Enter Your Option ");
            option = scanner.next().charAt(0);
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            option = Character.toUpperCase(option);

            switch (option) {

                case 'A': //Check your balance
                    System.out.println("-------------------------------------------------------");
                    obj.checkBalance();
                    System.out.println("-------------------------------------------------------");

                    break;

                case 'B':  //Deposit
                    System.out.println("-------------------------------------------------------");
                    obj.deposit();
                    System.out.println("Deposit Successfully...");
                    System.out.println("-------------------------------------------------------");

                    break;

                case 'C': //withdraw
                    System.out.println("-------------------------------------------------------");
                    obj.withdraw();
                    System.out.println("-------------------------------------------------------");
                    break;

                case 'D': //Previous Transaction
                    System.out.println("-------------------------------------------------------");
                    obj.getPreviousTransaction();
                    System.out.println("-------------------------------------------------------");
                    break;

                case 'E' :  //exit
                    System.out.println("=========================================================================================================");

                    break;

                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
            }
       } while(option!='E');

             System.out.println("Thank You for Using our Services.....!!");

    }
}


