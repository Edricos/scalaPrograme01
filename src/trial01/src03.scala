package trial01

import scala.util.Random
import scala.collection.mutable.Map

object src03 {
  def main(args: Array[String]): Unit = {
    var i = 1
    val dc = Map((1->0))
    for (i <- 1 to 1000){
      var r:Int = Random.nextInt(20)
      dc(r) = dc.getOrElse(r, 0) + 1
//      println(r)
    }
    println(dc)

  }

}
