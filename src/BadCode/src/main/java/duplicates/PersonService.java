package duplicates;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
  private final List<Person> persons = new ArrayList<>();

  public void addPerson(Person person){
    boolean exists = false;
    for (Person p : persons) {
      // om de custom equals() method ook echt te gebruiken moet je hier .equals() neerzetten ipv
      // ==. == werkt alleen op primitieve waarden.
      if (p.equals(person)) {
        exists = true;
        break;
      }
    }
    if (!exists) {
      persons.add(person);
    }
  }

  /**
   * Returns the number of unique persons.
   * @return the number of unique persons
   */
  public int size(){
    return persons.size();
  }

}