import java.text.ParseException;
import java.util.Date;


public class BankApp {
    public static void main(String[] args) throws ParseException {
        Account account = new Account(new Statement());
        // decidi utilizar una entrada entera en vez de amountOf para encapsular amount dentro
        // de StatementLine
        account.deposit(1000, MyDate.date("10/01/2021"));
        account.deposit(2000, MyDate.date("01/13/2021"));
        account.withdrawal(500, MyDate.date("01/14/2021"));
        account.printStatement();
    }
}
