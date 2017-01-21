/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.geometry;

import javax.swing.JOptionPane;

/**
 *
 * @author kostas
 */
public class Main {

    public static void main(String[] args) {
        // create a new point to use as circle center
        Point p1 = new Point(1, 1);
        
        // create a new point array to use for creating a rectangle
        Point[] p = {new Point(2, 2), new Point(8, 2),
            new Point(8, -1), new Point(2, -1)};
        
        // prompt user to make a selection
        int selection = Integer.parseInt(JOptionPane.showInputDialog(
                "Please select a shape. Press 1 for "
                + "circle, 2 for rectangle:"));
        
        // declare base class reference
        Shape s = null;
        switch (selection) {
            case 1:
                // create a circle (center p1, radius 4)
                s = new Circle(p1, 4);
                break;
            case 2:
                // create a new regtangle from the point array
                s = new Rectangle();
                s.setPoints(p);
                break;
            default:
                System.out.println("Invalid selection");
                System.exit(0);
        }
        
        // print shape name
        System.out.println("shape name: " + s.getName());

        // calculate and display circumference
        System.out.println("shape perimeter: " + s.perimeter());
        
        // calculate and display area
        System.out.println("shape area: " + s.area());
        
        System.exit(0);
    }
}
