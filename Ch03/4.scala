def sortArrayPosNeg(a: Array[Int]) = {
	a.filter(_ > 0) ++ a.filter (_ <= 0)
}


val test = Array(1,0,4,7,3,-1,5,-5);
val res = sortArrayPosNeg(test);
println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))
