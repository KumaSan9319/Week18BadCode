package duplicates;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

  /**
   * De PersonService zou alleen de unieke personen moeten toevoegen en duplicaten negeren.
   */

  // Ik heb de fix en de uitleg hiervan in de PersonService class gezet
  @Test
  void testPersonService(){
    PersonService personService = new PersonService();

    personService.addPerson(new Person("John Doe", 30, 1.75, 70));
    personService.addPerson(new Person("Jane Smith", 28, 1.65, 60));
    personService.addPerson(new Person("Alice Johnson", 35, 1.70, 65));
    personService.addPerson(new Person("Bob Williams", 40, 1.80, 75));
    personService.addPerson(new Person("Charlie Brown", 45, 1.85, 80));
    personService.addPerson(new Person("David Davis", 50, 1.90, 85));
    personService.addPerson(new Person("Eve Evans", 55, 1.60, 55));
    personService.addPerson(new Person("Frank Foster", 60, 1.95, 90));
    personService.addPerson(new Person("Grace Green", 65, 1.55, 50));
    personService.addPerson(new Person("Harry Hall", 70, 2.00, 95));
    personService.addPerson(new Person("Ivy Irving", 75, 1.50, 45));
    personService.addPerson(new Person("Jack Jackson", 80, 2.05, 100));
    personService.addPerson(new Person("Kathy King", 85, 1.45, 40));
    personService.addPerson(new Person("Larry Lewis", 90, 2.10, 105));
    personService.addPerson(new Person("Molly Moore", 95, 1.40, 35));
    personService.addPerson(new Person("John Doe", 30, 1.75, 70));
    personService.addPerson(new Person("Jane Smith", 28, 1.65, 60));
    personService.addPerson(new Person("Alice Johnson", 35, 1.70, 65));
    personService.addPerson(new Person("Bob Williams", 40, 1.80, 75));
    personService.addPerson(new Person("Charlie Brown", 45, 1.85, 80));

    assertEquals(15, personService.size());
  }

}