/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.geometry;

/**
 *
 * @author kostas
 */
public abstract class Shape {
    // member variables, constants
    private Point[] points;

    // methods
    public Shape (int size) {
        points = new Point[size];
    }

    public Shape (Point[] p) {
        points = p;
    }
    
    public Point[] getPoints() {
        return points;
    }
    
    public void setPoints(Point[] p) {
        points = p;
    }
    
    abstract public double area();
    
    abstract public double perimeter();
    
    abstract public String getName();
    abstract public void displayShapeData();
}
