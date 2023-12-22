package banksystem;

import java.util.HashMap;

public class BankService {
  private final HashMap<String, BankAccount> accounts = new HashMap<>();

  /**
   * Creates a new bank account with the given account holder and initial balance.
   *
   * @param accountHolder the account holder
   * @param initialBalance the initial balance
   */
  public void createAccount(String accountHolder, double initialBalance) {
    accounts.put(accountHolder, new BankAccount(accountHolder, initialBalance));
  }

  /**
   * Deposits the given amount to the bank account of the given account holder.
   *
   * @param accountHolder the account holder
   * @param amount the amount to deposit
   */
  public void deposit(String accountHolder, double amount) {
    BankAccount account = accounts.get(accountHolder);
    if (account != null) {
      account.deposit(amount);
    }
  }

  /**
   * Withdraws the given amount from the bank account of the given account holder.
   *
   * @param accountHolder the account holder
   * @param amount the amount to withdraw
   * @return true if the withdrawal was successful, false otherwise
   */
  public boolean withdraw(String accountHolder, double amount) {
    BankAccount account = accounts.get(accountHolder);
    // Er zijn 2 verschillende versies van de withdraw method. De BankService versie had geen
    // verification om te checken of de balance wel hoog genoeg was. Deze heb ik hieronder
    // toegevoegd
    if ((account != null) && (account.balance >= amount)) {
      account.balance -= amount;
      return true;
    }
    return false;
  }

  /**
   * Returns the balance of the bank account of the given account holder.
   *
   * @param accountHolder the account holder
   * @return the balance of the bank account of the given account holder
   */
  public double getBalance(String accountHolder) {
    BankAccount account = accounts.get(accountHolder);
    if (account != null) {
      return account.getBalance();
    }
    return 0;
  }
}