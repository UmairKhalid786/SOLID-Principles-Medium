open class Rectangle {  
    private var width: Int = 0  
    private var height: Int = 0
    
    fun getArea(): Int {  
        return width * height  
    } 
	
    open fun setWidth(width: Int) {  
        this.width = width  
    } 

    open fun setHeight(height: Int) {  
        this.height = height  
    }  
}


class Square : Rectangle() {  
    override fun setWidth(width: Int) {  
        super.setWidth(width)  
        super.setHeight(width)  
    }  
  
   override fun setHeight(height: Int) {  
        super.setWidth(height)  
        super.setHeight(height)  
    }  
}


val rectangle = Rectangle()  
rectangle.setWidth(3)  
rectangle.setHeight(5)  
rectangle.getArea() = 15

val square = Square()  
square.setWidth(3)  
square.setHeight(5)  
square.getArea() = 25