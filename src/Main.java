import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name,password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount ShoaibAcc = new SBIAccount(name,balance,password);
        System.out.println("Your account has been created with account no:"+ ShoaibAcc.getAccountNo());

        //getBalance
        System.out.println("Current Balance: "+ShoaibAcc.getBalance());

        //deposit
        System.out.println("Deposit Money: " + ShoaibAcc.depositMoney(500));
        System.out.println("Current Balance: "+ShoaibAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to withdraw and password: ");
        int amount = sc.nextInt();
        String enteredPassword = sc.next();
        System.out.println(ShoaibAcc.withdraw(amount, enteredPassword));
        System.out.println("Remaining balance:" + ShoaibAcc.getBalance());

        //interest
        System.out.println("Enter the period for which you want to check interest(int yrs):");
        int time = sc.nextInt();
        System.out.println("Rate of interest for "+time+ "yrs on current balance " + ShoaibAcc.getBalance() + " is " + ShoaibAcc.calculateInterest(time));


    }
}