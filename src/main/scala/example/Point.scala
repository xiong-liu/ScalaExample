package example

class Point {
    private var _x = 0
    private var _y = 0
    private val bound = 100
    def x: Int = _x
    def x_=(newValue: Int): Unit = {
        if (newValue < bound) _x = newValue else printWarning()
    }
    def y: Int = _y
    def y_=(newValue: Int): Unit = {
        if (newValue < bound) _y = newValue else printWarning()
    }
    private def printWarning(): Unit = println("WARNING: Out of bounds")
    override def toString: String = "_x="+_x+":"+"_y="+_y
}

object Main extends App {
    val point1 = new Point
    point1.x = 99
    point1.y = 70 // prints the warning

    println(point1.x)
    println(point1)
}