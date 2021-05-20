import scala.collection.JavaConverters._

object ExamenBigData {
  def main(args: Array[String]): Unit = {
    val l:List[String]=List("julien","paul","jean","rac","trec","joel","ed","chris","maurice")
    println(liste_tex(l))

  }

  //noinspection ComparingUnrelatedTypes
  def liste_tex(l1: List[String]): List[String] = {
    val l2 = l1.filter(s => s.charAt(s.length-1) == "n")
    return l2
  }
  def liste_double():Unit={
    val m=Map(
      "ecommercemag.fr"->" ",
      "https://www.journalducm.com/contact/"->"Payant",
      "https://www.zatsaz.com/"->" ",
      "https://www.lerevenu.com/"->" ",
      "https://www.cadre-dirigfdeant-magazine.com/"->"Payant",
      "https://www.silicon.fr/services/contact#annoncer"->"Payant",
      "https://www.channelbiz.fr/nous-contacter/"->" ",
      "https://www.itespresso.fr/"->" ",
      "https://www.industrie-mag.com/article4.html"->"invite",
      "https://www.jesuisundev.com/article-invite/"->"invite",
      "https://www.numerama.com/"->" ")
  }
}