package shapes;

public class Triangle implements Shape {

  private final double sideB;
  private final double sideA;
  private final double sideC;

  public Triangle(double sideB, double sideA, double sideC) {
    this.sideB = sideB;
    this.sideA = sideA;
    this.sideC = sideC;
  }

  /**
   * @return the area of the triangle
   */
  @Override
  public double getArea() {
    return sideB * sideA / 2;
  }

  /**
   * @return the perimeter of the triangle
   */
  @Override
  public double getPerimeter() {
    return sideB + sideA + sideC;
  }
}
