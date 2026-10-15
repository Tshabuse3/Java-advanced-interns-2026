package Chapter9;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/14/2026
 * Account Prefix:
 * <ul>
 *     <li>Debit: DB</li>
 *     <li>Savings: SV</li>
 *     <li>Credit: CR</li>
 *     <li>Cheque: CQ</li>
 *     <li>Loan: LN</li>
 * </ul>
 *
 * <h3>Exceptions</h3>
 * <ul>
 *     <li>InsufficientFundsException: Throw when tring to withdraw more than what is available</li>
 *     <li>IlligalArgumentException: Thrown when trying to deposit or withdraw negative amount</li>
 * </ul>
 **/


enum AccountType{
    DEBIT, SAVINGS, CREDIT, CHEQUE, LOAN
}
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private AccountType accountType;
    private double balance;

    //overloaded constructor

    public BankAccount(String accountHolder, String accountNumber, AccountType accountType, double balance) {
        setAccountHolder(accountHolder);
        setAccountType(accountType);
        setAccountNumber(accountNumber);
        setBalance(balance);

    }
    //getters and setters

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {

        this.accountHolder = accountHolder;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //provide logic to assign  the account prefix
    //SV-45968743
    public void setAccountNumber(String accountNumber) {
        String accPrefix;
        if (getAccountType() == AccountType.DEBIT) {
            accPrefix = "DB";
        } else if (getAccountType() == AccountType.LOAN) {
            accPrefix = "LN";
        } else if (getAccountType() == AccountType.SAVINGS) {
            accPrefix = "SV";
        } else if (getAccountType() == AccountType.CREDIT) {
            accPrefix = "CR";
        } else {
            accPrefix = "CQ";
        }
        this.accountNumber = accPrefix + "-" + accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Cannot deposit negative(-) or zero(R0) amount. " +
                    "[" + amount + "]");
        }
        this.balance += amount ;
    }

    public void withdraw(double amount) throws InsufficienFundsExceptions {
        if (amount <= 0) {
            throw new IllegalArgumentException("Cannot withdraw negative(-) or zero(R0) amount. " +
                    "[" + amount + "]");
        }
        if (amount > getBalance()) {
            throw new InsufficienFundsExceptions("Insufficient Funds...\nCurrent Balance: " + getBalance() +
                    "\nRequested Ampunt : " + amount);
        }
        this.balance -= amount;
    }

   public String displayDetails(){
        return String.format("""
                Account Holder     : %s
                Account Number     : %s
                Account Type       : %s
                Balance            : %.2f""",
                getAccountHolder(),getAccountNumber(),getAccountType(),getBalance());
   }
}

