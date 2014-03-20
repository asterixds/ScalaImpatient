import collection.mutable.Buffer
import collection.JavaConversions.asScalaBuffer
import java.awt.datatransfer._

val flavor = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]

val res: Buffer[String] = flavor.getNativesForFlavor(DataFlavor.imageFlavor)

println(res)