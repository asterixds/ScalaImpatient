val test = Array(1.0,0.0,4.0,7,3,-1,5,-5);
val buf = test.toBuffer
val res = test.sortWith(_ > _)
val res2=buf.sorted.reverse
println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))
println(res2.mkString("Buffer(", ", ", ")"))