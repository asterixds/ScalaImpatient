class Counter(private var count:Int = 0) {
	def increment() = { if (count < Int.MaxValue) count +=1}
	def current =count
}

val cnt = new Counter(Int.MaxValue - 1)

println (cnt.current)
cnt.increment()
println (cnt.current)
cnt.increment()
println (cnt.current)

