import java.util.Scanner;

public class ATM {

    static int balance = 1000;   // initial balance

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to ATM");

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully");
                    } else {
                        System.out.println("Enter valid amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Insufficient balance or invalid amount");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }
}
