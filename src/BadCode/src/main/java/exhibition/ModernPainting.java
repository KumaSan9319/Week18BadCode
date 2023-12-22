package exhibition;

/**
 * A class representing a modern painting.
 */
public class ModernPainting extends Painting {
  private final String style;

  public ModernPainting(String name, String creator, double insuranceValue, String style) {
    super(name, creator, insuranceValue);
    this.style = style;
  }

  public String getStyle() {
    return style;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", in the style of " + style;
  }
}