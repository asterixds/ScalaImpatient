class Money(d: Int, c: Int) {
	val dollars: Int = d+ c/100
	val cents: Int =  c % 100;
	override def toString = dollars + "." + cents;
	
	
	def +(other: Money) = {
		new Money(this.dollars + other.dollars , this.cents + other.cents)
	}
	
	def -(other: Money) = {
		new Money(this.dollars - other.dollars , this.cents -  other.cents)
	}


}

object Money {
	def apply(d: Int, c: Int) = new Money(d, c)
}

val x = Money(1, 40)
val y = Money(1, 20)

println(x + y)
println(x - y)




