package Chapter9;


/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/14/2026
 **/
public class BankAccountRunner {
    public static void main(String[] args) {
        try {
            BankAccount objAcc = new BankAccount("Jessic Jones", "9625887", AccountType.CHEQUE, 15000);
            objAcc.deposit(500);//15500
            objAcc.withdraw(1000);//14500

            System.out.println(objAcc.displayDetails());
        } catch (InsufficienFundsExceptions | IllegalArgumentException e ) {
            System.err.println(e.getMessage());
        }
    }
}