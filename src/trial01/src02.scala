package trial01

import scala.math.{pow, sqrt}

object src02 {
  class Point (xc: Double, yc: Double){
    private var x:Double = xc
    private var y:Double = yc
    def getX():Double = {
      return this.x
    }
    def setX(xi: Double):Unit = {
      this.x = xi
    }
    def getY():Double = {
      return this.y
    }
    def setY(yi: Double):Unit = {
      this.y = yi
    }

    def --(p2:Point): Double = {
      return sqrt(pow(this.x - p2.getX(), 2) + pow(this.y - p2.getY(), 2))
    }
  }
  def main(args: Array[String]): Unit = {
    var p1 = new Point(1,3)
    var p2 = new Point(1, 2)

    println(p1 -- p2)
  }

}
