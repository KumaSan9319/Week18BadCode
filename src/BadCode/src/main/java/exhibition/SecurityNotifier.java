package exhibition;

import java.util.List;
import java.util.Map;

public class SecurityNotifier {
  private static final double MINIMUM_INSURANCE_VALUE = 75000;
  private static final int GUARDS_PER_PAINTING = 2;
  private static final int GUARDS_COST_PER_DAY = 1200;

  /**
   * Notifies the guard station about the number of guards needed.
   * @param guardsNeeded the number of guards needed
   */
  private void notifyGuardStation(int guardsNeeded){
    //notify guard station
  }

  /**
   * Notifies the administration about the costs of the guards.
   * @param guardCosts the costs of the guards
   */
  private void notifyAdministration(double guardCosts){
    //notify administration
  }

  /**
   * Checks a list of insurable items for additional needed security.
   * @param items the list of insurable items
   * @return a map containing the number of guards needed and the costs of the guards
   */
  public Map<String, Number> checkListForAdditionalSecurity(List<Insurable> items){
    //remove items from list that are too low in insurance value to guard
    items.removeIf(item -> item.getInsuranceValue() < MINIMUM_INSURANCE_VALUE);

    int guardsNeeded = items.size() * GUARDS_PER_PAINTING;
    notifyGuardStation(guardsNeeded);

    double guardCosts = guardsNeeded * GUARDS_COST_PER_DAY;
    notifyAdministration(guardCosts);

    return Map.of("guardsNeeded", guardsNeeded, "guardCosts", guardCosts);
  }

}
