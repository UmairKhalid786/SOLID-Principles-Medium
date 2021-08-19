interface Shape {  
    fun getArea(): Int  
}

class Rectangle: Shape {  
	    private var width: Int = 0  
	    private var height: Int = 0 
	
	override fun getArea(): Int {  
        return width * height  
    } 
	
	fun setWidth(width: Int) {  
        this.width = width  
    } 
	
	fun setHeight(height: Int) {  
        this.height = height  
    }  
}

class Square: Shape {  
    private var diameter: Int = 0  
      
    override fun getArea(): Int {  
        return diameter * diameter  
    } 

	fun setDiameter(diameter: Int) {  
        this.diameter = diameter  
    }  
}

val rectangle = Rectangle()  
rectangle.setWidth(3)  
rectangle.setHeight(5)  
rectangle.getArea() = 15

val square = Square()  
square.setDiamater(5)  
square.getArea() = 25