package shapes;

public class Circle implements Shape {

  private final double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  /**
   * @return the radius
   */
  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * @return the perimeter
   */
  @Override
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
}
