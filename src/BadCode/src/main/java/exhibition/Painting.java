package exhibition;

/**
 * A class representing a painting.
 */
public class Painting extends Exhibit implements Insurable {
  private final double insuranceValue;

  public Painting(String name, String creator, double insuranceValue) {
    super(name, creator);
    this.insuranceValue = insuranceValue;
  }

  @Override
  public String getDescription() {
    return "A painting named " + name + " by " + creator;
  }

  @Override
  public double getInsuranceValue() {
    return insuranceValue;
  }
}