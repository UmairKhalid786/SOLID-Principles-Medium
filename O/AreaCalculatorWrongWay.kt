
class AreaCalculator {

    fun calculateArea(shapes : List<Shape>) = shapes.sumOf {
        if (it is Square)
            it.side * it.side
        else if (it  is Circle)
            (it.radius * it.radius * Math.PI).toInt()
        else if (it  is Rectangle)
            it.width * it.height
        else
            0
    }
}

class Square(val side : Int) : Shape
class Circle(val radius : Int) : Shape
class Rectangle(val width : Int, val height : Int) : Shape

//Shape interface
interface Shape