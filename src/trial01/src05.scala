package trial01

import trial01.src02.Point

import java.io.{File, FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream, PrintWriter}
import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.math.{pow, sqrt}

object src05 {

//  @SerialVersionUID(1L)
//  class Point(xc: Double, yc: Double) extends Serializable {
//    private var x: Double = xc
//    private var y: Double = yc
//
//    def getX(): Double = {
//      return this.x
//    }
//
//    def setX(xi: Double): Unit = {
//      this.x = xi
//    }
//
//    def getY(): Double = {
//      return this.y
//    }
//
//    def setY(yi: Double): Unit = {
//      this.y = yi
//    }
//
//    def --(p2: Point): Double = {
//      return sqrt(pow(this.x - p2.getX(), 2) + pow(this.y - p2.getY(), 2))
//    }
//
//    override def toString : String = {
//      return "("+ this.x +"," + this.y + ")"
//    }
//  }
//
//  class Road(start: Point, end: Point, distence: Int){
//
//  }




  def main(args: Array[String]): Unit = {

//    var p1 = new Point(2, 4)
//    val out = new ObjectOutputStream(new FileOutputStream("p1.txt"))
//    out.writeObject(p1)
//    out.close()
//
//    val in = new ObjectInputStream(new FileInputStream("p1.txt"))
//    val value = in.readObject()
//    println(value)

//    var graph1 = Map(
//      (List(1,2)->2),
//      (List(1,5)->10),
//      (List(3,1)->4),
//      (List(3,4)->4),
//      (List(4,5)->5),
//      (List(5,3)->3),
//      (List(2,3)->3)
//    )

    var graph2:ListBuffer[ListBuffer[Int]] = ListBuffer(
      ListBuffer(1, 2, 2),
      ListBuffer(1, 5, 10),
      ListBuffer(3, 1, 4),
      ListBuffer(3, 4, 4),
      ListBuffer(4, 5, 5),
      ListBuffer(5, 3, 3),
      ListBuffer(2, 3, 3)
    )

//    var writer = new PrintWriter(new File("p1.txt"))
//    writer.append(p1.toString)
//    writer.close()

    print(graph2(0)(0))


  }

  def distence(start:Int, end:Int, graph1:ListBuffer[ListBuffer[Int]]) : ListBuffer[Int] = {

    var routes:ListBuffer[Int] = ListBuffer(start)


  }
}
