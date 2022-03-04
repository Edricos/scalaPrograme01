package trial01

import scala.io.Source
import scala.collection.mutable.Map


object src04 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("s4.txt")
    val iterator = source.getLines()
//    println(iterator.next())

    var wc = Map(""->0)
    while (iterator.hasNext){
      val strings = iterator.next().split("[, .]")
      var s:String = ""
      for( s <- strings){
        wc(s)= wc.getOrElse(s, 0) + 1
      }
    }
    println(wc)
  }

}
