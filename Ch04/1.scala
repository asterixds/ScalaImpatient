def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val gizmos = Map("ipad"->400,"iphone"->200)
val discounted = for((k,v)<-gizmos) yield (k,v*0.9)
prn(gizmos)
prn(discounted)
