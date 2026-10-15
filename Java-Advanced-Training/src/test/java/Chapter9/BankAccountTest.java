package Chapter9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/14/2026
 **/
public class BankAccountTest {

    BankAccount objAcc;

    @BeforeEach
    void setupAccount(){
        objAcc = new BankAccount("Jessica Jones", "9625887",AccountType.CHEQUE,15000);
    }
    @Test
    void testDeposit(){
        //Arrange
        double amountToDeposit = 600;
        double expectedBalance = 15600;
        //actual
        objAcc.deposit(amountToDeposit);
        double actualBalance = objAcc.getBalance();
        //Assert
        assertEquals(expectedBalance, actualBalance);

    }

    @Test
    void testInvalidDeposit(){
        assertThrows(IllegalArgumentException.class, () -> objAcc.deposit(-500));
    }

    @Test
    void testWithdraw(){
        double amountToWithdraw = 1500;
        double expectedBalance = 13500;
        //actual
        try {
            objAcc.withdraw(amountToWithdraw);
            double actualBalance = objAcc.getBalance();
            assertEquals(expectedBalance, actualBalance);
        } catch (InsufficienFundsExceptions e) {
            System.err.println(e.getMessage());
        }

    }
    @Test
    void testInvalidWithdrawalNegativeAmount(){
        assertThrows(IllegalArgumentException.class,
                () -> objAcc.withdraw(-100));
    }

    @Test
    void testWithdrawalInsufficientFunds(){
        double amountToWithdraw = objAcc.getBalance() + 1;
        assertThrows(InsufficienFundsExceptions.class,
                () -> objAcc.withdraw(amountToWithdraw));
    }

    @AfterEach
    void getAccountDetails(){
        System.err.println(objAcc.displayDetails());
    }
    @Test
    void testAccountNumberPrefix(){
        String accountNumber = "123456";
        String accountHolder = "John Smith";
        double balance = 5000;

        BankAccount objLoan = new BankAccount(accountHolder,accountNumber,AccountType.LOAN,balance);
        BankAccount objDebit = new BankAccount(accountHolder,accountNumber,AccountType.DEBIT,balance);
        BankAccount objCheque = new BankAccount(accountHolder,accountNumber,AccountType.CHEQUE,balance);
        BankAccount objCredit = new BankAccount(accountHolder,accountNumber,AccountType.CREDIT,balance);
        BankAccount objSavings = new BankAccount(accountHolder,accountNumber,AccountType.SAVINGS,balance);

        assertAll(
                () -> assertEquals("LN-" + accountNumber, objLoan.getAccountNumber()),
                () -> assertEquals("DB-" + accountNumber, objDebit.getAccountNumber()),
                () -> assertEquals("CQ-" + accountNumber, objCheque.getAccountNumber()),
                () -> assertEquals("CR-" + accountNumber, objCredit.getAccountNumber()),
                () -> assertEquals("SV-" + accountNumber, objSavings.getAccountNumber())
        );
    }
}