package inheritance

// inherits from polygon class
class Triangle(var width: Double, var height: Double) extends Polygon with Shape {

  // override abstract method area from Polygon class
  override def area: Double = width * height / 2;

  override def colour: String = "Green"


}
