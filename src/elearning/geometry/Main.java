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
public class Main {

    public static void main(String[] args)
    {
        // create a new point to use as circle center
        //Point p1 = new Point(1, 1);
        //p1.displayCoords();
        
        // create a circle (center p1, radius 4)
        //Circle c1 = new Circle(p1, 4);
        Circle c1 = new Circle(1, 1, 4);
        
        // calculate and display circumference
        System.out.println("circle circumference: " + c1.perimeter());
        System.out.println();
        // c1.displayCircleData();
        
        // calculate and display area
        System.out.println("circle area: " + c1.area());
        
        // display circle data
        // System.out.println("Display circle data: ");
        // c1.displayCircleData();
        
        System.out.println();
        // create a new point array to use for creating a rectangle
        Point[] p = {new Point(2, 2), new Point(8, 2), new Point(8, -1), new Point(2, -1)};
        
        // create a new regtangle from the point array
        Rectangle r1 = new Rectangle(p);
        //r1.displayRectangleData();
        
        Rectangle r2 = new Rectangle(r1);
        
        // calculate and display perimeter
        System.out.println("rectangle perimeter: " + r2.perimeter());
        
        // calculate and display area
        System.out.println("regtangle area: " + r2.area());
    }
}
