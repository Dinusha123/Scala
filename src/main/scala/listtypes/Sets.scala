package listtype

object Sets extends  App {
  // in sets there is no duplicates
  val myList: Set[Int] = Set(1,2,3,4,4,4,4,5,10,10);
  val names: Set[String] = Set("Dinusha","Heshan","Denuwan","Dinusha");

  println(myList)
  println(names)

  println("\nCheck whether certain value is contains in the set")
  println(myList(5))
  println(myList(15))


}
