val gizmos = Map(”ipad”->400,”iphone”->200)
for((k,v)<-gizmos) println(k)
for((k,v)<-gizmos) yield (k,v*0.9)
for((k,v)<-gizmos) println(k)
