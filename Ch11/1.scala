class Fraction(n: Int, d: Int) {
	private val num: Int = if (d == 0) 1 else n * signum(d) / gcd(n, d);
	private val den: Int = if (d == 0) 0 else d * signum(d) / gcd(n, d);
	override def toString = num + "/" + den
	def signum(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
	def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

	def +(other: Fraction) = {
		new Fraction(this.num * other.den + other.num * this.den, this.den * other.den)
	}
	def -(other: Fraction) = {
		new Fraction(this.num * other.den - other.num * this.den, this.den * other.den)
	}

	def *(other: Fraction) = {
		new Fraction(this.num * other.num, this.den * other.den)
	}

	def /(other: Fraction) = {
		new Fraction(this.num * other.den, this.den * other.num)
	}

}

object Fraction {
	def apply(n: Int, d: Int) = new Fraction(n, d)
}

val x = Fraction(1, 4)
val y = Fraction(1, 2)

println(x + y)
println(x - y)
println(x * y)
println(x / y)
