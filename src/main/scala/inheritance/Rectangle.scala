package inheritance

// inherits from polygon class
class Rectangle(var width: Double,var height: Double) extends Polygon with Shape {

  // override abstract method area from Polygon class
  override def area: Double = width * height;

  override def colour: String = "Red"

}
