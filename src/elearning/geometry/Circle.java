/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.geometry;

public class Circle extends Shape {
// member variables, constants
    private int radius;
    public static final double PI = 3.14159;

    // methods
    
    // default constructor
    public Circle() {
        super(1);
    }

    // constructor that creates a Circle from a Point and a radius
    public Circle(Point c, int r) {
        super(1);
        radius = r;
        getPoints()[0] = c;
    }
    
    public Circle(int x, int y, int r) {
        super(1);
        getPoints()[0] = new Point(x, y);
        radius = r;
    }
    
    // getters/setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void displayCircleData() {
        System.out.print("center: ");
        getPoints()[0].displayCoords();
        System.out.println("radius: " + getRadius());
    }
    
    // behavioural methods
    // calculates and returns Circle area
    public double area() {
        return PI * radius * radius;
    }

    // calculates and returns Circle circumference
    public double perimeter() {
        return 2 * PI * radius;
    }
}
