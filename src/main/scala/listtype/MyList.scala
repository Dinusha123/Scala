package listtype

object MyList extends App {

  var list = List(1,2,3,5,4,6,9,8,10);

  var second_list  = List(45,60,12,25);

  var name_list: List[String] = List("Dinusha","Heshan","Denuwan");

  print("list :")
  list.foreach((value: Int)=> print(value+" "))  //iterating using foreach

  println("\nElement at index 2 : " + list(2)) // get the values at 2nd index

  //merging two lists
  var merged_list = list++second_list;
  print("merged_list :")
  merged_list.foreach((value: Int)=> print(value+" "))  //iterating using foreach

  //sorting list
  var sorted_list = merged_list.sorted;
  print("\nsorted_list :")
  sorted_list.foreach((value: Int)=> print(value+" "))  //iterating using foreach

  // for-loops
  print("\nsorted_list_2(for-loop) :")
  for(x <- sorted_list){
    print(x+" ")
  }

  print("\nsorted_list_2(for-loop_2) :")
  for(x <- 0 to sorted_list.length-1){
    print(x+" ")
  }

  print("\nname_list :")
  name_list.foreach((value: String)=> print(value+" "))  //iterating using foreach






}
