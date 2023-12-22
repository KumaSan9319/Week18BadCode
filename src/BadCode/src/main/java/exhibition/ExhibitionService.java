package exhibition;

import java.util.List;
import java.util.Map;

public class ExhibitionService {
  private List<Insurable> exhibitions;
  private int numberOfSecurityGuards;
  private double securityCosts;

  /**
   * @return the number of security guards needed.
   */
  public int getNumberOfSecurityGuards() {
    return numberOfSecurityGuards;
  }

  /**
   * @return the costs of the security guards.
   */
  public double getSecurityCosts() {
    return securityCosts;
  }

  /**
   * Adds a new exhibitions to the list of exhibitions.
   *
   * @param exhibitions the exhibition to add
   */

  // Oorspronkelijk werd hier de originele lijst meegegeven ipv een copy. Nu geven we een copy mee
  // waardoor de originele lijst niet meer wordt aangepast door bepaalde methodes in deze class.
  public void addExhibitions(List<Insurable> exhibitions) {
    this.exhibitions = List.copyOf(exhibitions);

    SecurityNotifier securityNotifier = new SecurityNotifier();
    Map<String, Number> security = securityNotifier.checkListForAdditionalSecurity(exhibitions);
    numberOfSecurityGuards = (int) security.get("guardsNeeded");
    securityCosts = (double) security.get("guardCosts");
  }

  /**
   * Returns the total insurance value of all exhibitions.
   *
   * @return the total insurance value of all exhibitions
   */
  public double getTotalInsuranceValue() {
    double totalInsuranceValue = 0;
    for (Insurable exhibition : exhibitions) {
      totalInsuranceValue += exhibition.getInsuranceValue();
    }
    return totalInsuranceValue;
  }

}
