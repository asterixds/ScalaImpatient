import util.Random


def swapAdj(a: Array[Int]) = {
	for (i<- 0 until (a.length,2)) 
		if (i<a.length-1) {val temp= a(i+1);a(i+1)=a(i);a(i)=temp;}
	a;
}

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n);
	a;
}

val test = randomArray(11);
println(test.mkString("Array(", ", ", ")"))

val res = swapAdj(test);
println(res.mkString("Array(", ", ", ")"))
