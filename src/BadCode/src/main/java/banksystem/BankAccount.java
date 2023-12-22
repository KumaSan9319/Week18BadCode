package banksystem;

public class BankAccount {
  private final String accountHolder;
  public double balance;

  /**
   * Creates a new bank account with the given account holder and initial balance.
   *
   * @param accountHolder the account holder
   * @param balance the initial balance
   */
  public BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  /**
   * Deposits the given amount to this bank account.
   *
   * @param amount the amount to deposit
   */
  public void deposit(double amount) {
    balance += amount;
  }

  /**
   * Withdraws the given amount from this bank account.
   *
   * @param amount the amount to withdraw
   * @return true if the withdrawal was successful, false otherwise
   */
  public boolean withdraw(double amount) {
    if(balance < amount) {
      return false;
    }
    balance -= amount;
    return true;
  }

  /**
   * Returns the balance of this bank account.
   *
   * @return the balance of this bank account
   */
  public double getBalance() {
    return balance;
  }
}