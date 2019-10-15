package inheritance

//abstract class
abstract class Polygon {
  def area : Double;
}

/**
  * interface declaration
  */
trait Shape {
  def colour: String;
}


object Polygon{

  def main(args: Array[String]): Unit ={
    // creating rectangle object
    var rectangle = new Rectangle(12.5,15.5);
    //println(rectangle.area);
    printArea(rectangle)
    println(rectangle.colour)

    // creating triangle object
    var triangle = new Triangle(12.5,15.5);
    //println(triangle.area);
    printArea(triangle)
    println(triangle.colour)

  }

  /**
    * function to print area when the Polygon type object is given as parameters
    * @param p
    */
  def printArea(p: Polygon): Unit = {
    println("Area is"+p.area)
  }
}
