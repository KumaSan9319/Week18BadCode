package shapes;

public class Square implements Shape {

  private final double width;
  private final double height;

  public Square(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * @return the area of the square
   */
  @Override
  public double getArea() {
    return width * height;
  }

  /**
   * @return the perimeter of the square
   */
  @Override
  public double getPerimeter() {
    return width * 2 + height * 2;
  }
}
