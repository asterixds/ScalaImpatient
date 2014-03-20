import util.Random

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n);
	a
}

val test = randomArray(20);
val res = test.distinct.sorted
println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))
