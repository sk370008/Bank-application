import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter 0 for SBI bank or 1 for HDFC bank");
        int n = sc.nextInt();
        bankChoice(n);

    }

    static boolean firstTime = false;

    public static void SBIBank(SBIAccount ShoaibAcc){
        System.out.println("Select one:");
        System.out.println("1.Check Balance \n" +
                "2.Deposit Money \n" +
                "3.withdraw money \n" +
                "4.Calculate Interest\n" +
                "5.Exit\n");

        int n = sc.nextInt();
        switch (n){
            //getBalance
            case 1:
                System.out.println("Current Balance: "+ShoaibAcc.getBalance() +"\n");
                SBIBank(ShoaibAcc);
                break;
            //deposit
            case 2:
                System.out.println("Enter amount to deposit");
                int amt = sc.nextInt();
                System.out.println("Deposit Money: " + ShoaibAcc.depositMoney(amt));
                System.out.println("Current Balance: "+ShoaibAcc.getBalance() + "\n");
                SBIBank(ShoaibAcc);
                break;
            //withdraw
            case 3:
                System.out.println("Enter amount to withdraw and password: ");
                int amount = sc.nextInt();
                String enteredPassword = sc.next();
                System.out.println(ShoaibAcc.withdraw(amount, enteredPassword));
                System.out.println("Remaining balance:" + ShoaibAcc.getBalance() + "\n");
                SBIBank(ShoaibAcc);
                break;
            //interest
            case 4:
                System.out.println("Enter the period for which you want to check interest(int yrs):");
                int time = sc.nextInt();
                System.out.println("Rate of interest for "+time+ "yrs on current balance " + ShoaibAcc.getBalance() + " is " + ShoaibAcc.calculateInterest(time) + "\n");
                SBIBank(ShoaibAcc);
                break;
            case 5:
                System.out.println("Thank you for banking with us");
                return;
        }
    }



    public static void HDFCBank(HDFCAccount ShoaibAcc){
        System.out.println("Select one:");
        System.out.println("1.Check Balance \n" +
                "2.Deposit Money \n" +
                "3.withdraw money \n" +
                "4.Calculate Interest\n" +
                "5.Exit\n");

        int n = sc.nextInt();
        switch (n){
            //getBalance
            case 1:
                System.out.println("Current Balance: "+ShoaibAcc.getBalance() +"\n");
                HDFCBank(ShoaibAcc);
                break;
            //deposit
            case 2:
                System.out.println("Enter amount to deposit");
                int amt = sc.nextInt();
                System.out.println("Deposit Money: " + ShoaibAcc.depositMoney(amt));
                System.out.println("Current Balance: "+ShoaibAcc.getBalance() + "\n");
                HDFCBank(ShoaibAcc);
                break;
            //withdraw
            case 3:
                System.out.println("Enter amount to withdraw and password: ");
                int amount = sc.nextInt();
                String enteredPassword = sc.next();
                System.out.println(ShoaibAcc.withdraw(amount, enteredPassword));
                System.out.println("Remaining balance:" + ShoaibAcc.getBalance() + "\n");
                HDFCBank(ShoaibAcc);
                break;
            //interest
            case 4:
                System.out.println("Enter the period for which you want to check interest(int yrs):");
                int time = sc.nextInt();
                System.out.println("Rate of interest for "+time+ "yrs on current balance " + ShoaibAcc.getBalance() + " is " + ShoaibAcc.calculateInterest(time) + "\n");
                HDFCBank(ShoaibAcc);
                break;
            case 5:
                System.out.println("Thank you for banking with us");
                return;
        }
    }


    public static void bankChoice(int n){

        if(n==0){
            System.out.println("Enter your name,password and initial balance");
            String name = sc.next();
            String password = sc.next();
            int balance = 1000;
            SBIAccount ShoaibAcc = new SBIAccount(name,balance,password);
            System.out.println("Your SBI account has been created with account no:"+ ShoaibAcc.getAccountNo());
            SBIBank(ShoaibAcc);
        } else if (n == 1) {
            System.out.println("Enter your name,password and initial balance");
            String name = sc.next();
            String password = sc.next();
            int balance = 5000;
            HDFCAccount ShoaibAcc = new HDFCAccount(name,balance,password);
            System.out.println("Your SBI account has been created with account no:"+ ShoaibAcc.getAccountNo());
            HDFCBank(ShoaibAcc);
        }
        else {
            System.out.println("wrong INPUT!!!");
            System.out.println("Enter 0 for SBI or 1 for HDFC");
            int newChoice = sc.nextInt();
            bankChoice(newChoice);
        }
    }
}