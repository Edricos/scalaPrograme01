package trial01

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

object src01 {
  def main(args: Array[String]): Unit = {

    var writer = new PrintWriter(new File("ok.txt"))
    writer.write("not ok\n")
    writer.write("very not ok\n")

    Source.fromFile("ok.txt").foreach{
      print
    }

    writer.write("ok")
    writer.close()
    println("输入：")

//    var var01: String = StdIn.readLine()
//    while (var01 != "0") {
//      if1(var01)
//      var01 = StdIn.readLine()
//    }

  }


  def if1(var01: String): Unit = {
    println("输入 0 退出循环")
    if (var01 == "1") {
      println("输入了 1")
    }
    else {
      println("输入的不是 1")
    }
  }
}
