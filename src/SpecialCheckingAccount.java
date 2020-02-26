public class SpecialCheckingAccount extends CheckingAccount {

    private double minBalance;
    private double interestRate;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double intRate, double minBal ){
        super(idNumber, startBal, cc);
        minBalance=minBal;
        interestRate=intRate;

    }
    @Override
    public void clearCheck(double amount){
        if (currentBalance() < minBalance ) {
            super.clearCheck(amount);
        }
        else
            decreaseBalance(amount);
        }

    public double monthlyInterest(){
        if (currentBalance() > minBalance){
            return currentBalance()*(interestRate/12);
        }
        else
            return super.monthlyInterest();
    }
}

