interface TwoDShape {
    fun area(): Float
}

interface ThreeDShape {
    fun volume(): Float
}


class Square : TwoDShape {
    var side: Float = 0f
    override fun area() = side * side
}

class Cube : ThreeDShape {
    var side: Float = 0f
    
    override fun volume() = side * side * side
}