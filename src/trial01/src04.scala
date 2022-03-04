package trial01

import scala.io.Source

object src04 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("s4.txt")
    val iterator = source.getLines()
    println(iterator)
  }

}
