package shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class ShapeTest {

  /*
  * De method "Shape.getAreaOfShape" werkt naar behoren, alle testen slagen.
  * Alleen klopt er iets niet aan die method.
  */

  // In de eerste instantie had ik in de statische getAreaOfShape methode in Shape de casting
  // weggehaald omdat dat redundant was. Ik heb daarna besloten dat ik de hele methode niet nodig
  // vond en hem verwijderd. Om de testen te laten werken heb ik alle references naar die statische
  // methode veranderd naar de getArea() methodes van de objecten zelf. Deze werken ook altijd
  // vanwege polymorphism.
  @Test
  void getAreaOfShapeForTriangle() {
    Triangle triangle = new Triangle(3, 4, 5);
    double expectedArea = 6.0;
    assertEquals(expectedArea, triangle.getArea());
  }

  @Test
  void getAreaOfShapeForSquare() {
    Square square = new Square(5.0, 5.0);
    double expectedArea = 25.0;
    assertEquals(expectedArea, square.getArea());
  }

  @Test
  void getAreaOfShapeForCircle() {
    Circle circle = new Circle(3);
    double expectedArea = Math.PI * 9;
    assertEquals(expectedArea, circle.getArea());
  }

}