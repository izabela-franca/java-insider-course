package account;

public class AccountService {

    public void createAndWithdraw(String accountNumber, double amount) throws ServiceException{
        Account4 account = new Account4(accountNumber);
        account.deposit(1000);

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            throw new ServiceException("Error during withdraw", e);
        }

    }
}
