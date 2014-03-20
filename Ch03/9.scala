val zones = java.util.TimeZone.getAvailableIDs
val american = zones.filter(_.startsWith("America/")).map(_.drop("America/".size))
 
println(zones.mkString("Array(", ", ", ")"))
println(american.mkString("Array(", ", ", ")"))


