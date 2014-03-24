class Time(private var h: Int = 0, private var m: Int = 0) {

	def minutes = h*60+m
	def before(other: Time) =minutes< other.minutes
}

val time = new Time(2, 30)

println("Time is: " + time.minutes/60 + ":" + time.minutes % 60)

println("Is before" + time.before(new Time(3,10)))


