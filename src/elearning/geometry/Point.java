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
public class Point
{
    // member variables
    private int x;
    private int y;
    // x coord
    // y coord

    // methods
    // default constructor
    public Point() { }
    
    // initialization constructor with ints
    public Point(int p_x, int p_y){
        x = p_x;
        y = p_y;
    }
    
    // constructor that creates a Point from another Point (copy)
    public Point(Point p){
        x = p.getX();
        y = p.getY();
    }
    
    // getters/setters
    public void setX(int p_x){
        x = p_x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int p_y){
        y = p_y;
    }
    
    public int getY(){
        return y;
    }
    // display point coords
    public void displayCoords(){
        System.out.print("x = " + x);
        System.out.println(", y = " + y);
    }
}
