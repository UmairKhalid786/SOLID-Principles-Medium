interface Shape {
    fun area(): Float
    fun volume(): Float
}

class Square : Shape {
    var side: Float = 0f
    override fun area() = side * side

    override fun volume(): Float {
        //Does not apply for Square so returning zero
        return 0f
    }
}

class Cube : Shape {
    var side: Float = 0f
    override fun area(): Float {
        //Does not apply for Cube so returning zero
        return 0f
    }

    override fun volume() = side * side * side
}