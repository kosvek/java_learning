/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.geometry;

public class Rectangle extends Shape {
    // member variables
    public static final String NAME = "Rectangle";


    // private Point[] points;
// methods
// default constructor

    public Rectangle() {
        super(4);
        //points = new Point[4];
    }

    // constructor that creates a Rectangle
// from a Point array
    public Rectangle(Point[] p) {
        super(p);
        //points = p;
    }

// constructor that creates a Rectangle
// from another Rectangle (copy)

    public Rectangle(Rectangle r) {
        super(4);
        setPoints(r.getPoints());
        //points = r.getPoints();
    }
// getters/setters

// helper methods
// calculates and returns Rectangle width

    public int getWidth() {
        return getPoints()[1].getX() - getPoints()[0].getX();
    }
// calculates and returns Rectangle height

    public int getHeight() {
        return getPoints()[1].getY() - getPoints()[2].getY();
    }
    
    public String getName() {
        return NAME;
    }

    public void displayShapeData() {
        System.out.print("point A: ");
        getPoints()[0].displayCoords();
        System.out.print("point B: ");
        getPoints()[1].displayCoords();
        System.out.print("point Γ: ");
        getPoints()[2].displayCoords();
        System.out.print("point Δ: ");
        getPoints()[3].displayCoords();
        
        System.out.println("width: " + getWidth());
        System.out.println("height: " + getHeight());
    }
// behavioural methods
// calculates and returns Rectangle area

    public double area() {
        return getWidth() * getHeight();
    }
// calculates and returns Rectangle perimeter

    public double perimeter() {
        return 2 * getWidth() + 2 * getHeight();
    }
}
