package duplicates;

public class Person {

  private final String name;
  private final int age;
  private final double height;
  private final double weight;

  public Person(String name, int age, double height, double weight){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Person)){ return false; }

    Person person = (Person) obj;
    return  name.equals(person.name) &&
            age == person.age &&
            height == person.height &&
            weight == person.weight;
  }

  @Override
  public String toString() {
    return "%s is %d years old, %.2f m tall and weighs %.2f kg".formatted(name, age, height, weight);
  }
}
