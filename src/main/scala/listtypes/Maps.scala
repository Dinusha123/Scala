package listtype

object Maps extends App {

  val myMap: Map[Int,String] = Map(10->"Scala",11->"Java",12->"Angular")

  println(myMap)
  println(myMap(11))
  println(myMap.keys)
  println(myMap.values)

  print("\nPrints myMap :")
  myMap.keys.foreach{
    key => println("\nKey :"+key);
      println("Value :"+myMap(key))
  }

  println("\nIs contains in map")
  println(myMap.contains(20))
  println(myMap.contains(12))

}
