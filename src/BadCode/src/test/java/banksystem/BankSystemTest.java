package banksystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankSystemTest {

  @Test
  void testBankAccountWithdraw() {
    BankAccount account = new BankAccount("John Doe", 100);
    boolean couldWithdraw = account.withdraw(150);
    assertFalse(couldWithdraw);
  }

  /*
   * Het banksystem zou zo geschreven moeten zijn dat het niet mogelijk is om
   * meer geld op te nemen dan er op de rekening staat. De test faalt echter omdat
   * er wel meer geld opgenomen kan worden dan op de rekening staat.
   *
   * Het rare alleen is, dat de test hierboven wel slaagt.
   *
   * Wat gaat er mis? Zoek het probleem en los het op.
   */

  // Ik heb de oplossing en de bijbehorende uitleg in de BankService class gezet

  @Test
  void testBankServiceWithdraw() {
    BankService bankService = new BankService();
    bankService.createAccount("John Doe", 100);
    boolean couldWithdraw = bankService.withdraw("John Doe", 150);
    assertFalse(couldWithdraw);
  }

}
