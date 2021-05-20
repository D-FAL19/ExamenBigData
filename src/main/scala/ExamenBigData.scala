import scala.collection.JavaConverters._

object ExamenBigData {
  def main(args: Array[String]): Unit = {

  }
  //noinspection ComparingUnrelatedTypes
  def modif_fin(l1: List[String]): List[String] = {
    val l2 = l1.filter(s => s.charAt(s.length-1) == "n")
    return l2
  }
}
