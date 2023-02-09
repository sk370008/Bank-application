public interface BankInterface {
    //To check account balance
    int getBalance();
    //To deposit money
    String depositMoney(int amount);
    //To withdraw money
    String withdraw(int amount,String enteredPassword);
    //To calculate interest on the current amount
    double calculateInterest(int time);
}
