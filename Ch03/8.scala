import scala.collection.mutable.ArrayBuffer

val test = ArrayBuffer[Int]()
test += (1,0,4,7,3,-1,5,-5);
println(test.mkString("Array(", ", ", ")"))

val indexes = for (i<- 0 until test.length; if (test(i)<0)) yield i 
println(indexes.mkString("Array(", ", ", ")"))
if (indexes.length> 0) indexes.sorted.reverse.dropRight(1).foreach(test.remove(_))
 
println(test.mkString("Array(", ", ", ")"))



