**
* Created by Umair on 08,August,2021
*/

class AreaCalculator {

    fun calculateArea(shapes : List<Shape>) = shapes.sumOf {
        if (it is Square)
            it.side * it.side
        else if (it  is Circle)
            (it.radius * it.radius * Math.PI).toInt()
        else
            0
    }
}

class Square(val side : Int) : Shape
class Circle(val radius : Int) : Shape

//Shape interface
interface Shape
