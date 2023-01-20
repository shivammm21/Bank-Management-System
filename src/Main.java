import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            BankLogin login = new BankLogin();
            System.out.println();

            System.out.println("--------------WELCOME TO BANK MANAGEMENT SYSTEM--------------");
            do {
                System.out.println("1.New Account Opening");
                System.out.println("2.Account Login");
                System.out.println("3.Account Details");
                System.out.println("4.Exit");
                System.out.print("Enter number : ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:

                        login.newUser();

                        System.out.print("Are you login (y/n) ");
                        char ans = scanner.next().charAt(0);
                        ans = Character.toLowerCase(ans);
                        if (ans == 'y') {
                            login.newUserLogin();

                        } else if (ans == 'n') {
                            System.out.println("Thank you for create an Acoount");
                        } else {
                            System.out.println("Invalid");
                        }

                        break;
                    case 2:
                        login.oldUserLogin();
                        break;
                    case 3:
                        login.userDetails();
                        break;
                    case 4:
                        System.out.println("Thank You for Using our Services.....!!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid");
                }
            } while (true);
        }catch (Exception e){
            System.out.print(e);
        }
    }
}