package com.example.a2by3_android


/**
 * Created by Umair on 08,August,2021
 */

class AreaCalculator {

    // Your method will become one liner :) you can add thousands of shapes and your area calculator
    // wont have to add extra word in it
    fun calculateArea(shapes : List<Shape>) = shapes.sumOf { it.area() }
}

class Square(val side : Int) : Shape {
    override fun area() = side * side
}

class Rectangle(val height : Int,
                val width : Int) : Shape {
    override fun area() = height * width
}

class Circle(val radius : Int) : Shape {
    override fun area() = (radius * radius * Math.PI).toInt()
}

//Shape interface
interface Shape {
    fun area() : Int //Added interface method
}