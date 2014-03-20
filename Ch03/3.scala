import util.Random


def swapAdj(a: Array[Int]) = {
	for (i<- 0 until (a.length)) yield 
		if (i % 2 ==0) {
			if (i < a.size-1)
					a(i+1)
				else
					a(i)
			} 
		else a(i-1)
}

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n);
	a;
}

val test = randomArray(11);
val res = swapAdj(test);
println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))
