package exhibition;

/**
 * An abstract class representing an exhibit.
 */
public abstract class Exhibit {
  protected String name;
  protected String creator;

  public Exhibit(String name, String creator) {
    this.name = name;
    this.creator = creator;
  }

  public abstract String getDescription();
}