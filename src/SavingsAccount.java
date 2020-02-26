public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int idNumber, double startBal, double intRate){
        super(idNumber, startBal);
        interestRate=intRate;

    }

    public void withdraw(double amount){
        if (amount<=super.currentBalance()){
            super.decreaseBalance(amount);
        }
    }

    public double monthlyInterest(){
        return super.currentBalance()*(interestRate/12);
    }

}
