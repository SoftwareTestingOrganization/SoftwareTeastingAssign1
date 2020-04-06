/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Iqra Ishtiaq
 */
//Circle class which is inherited from Shape Class
public class Circle extends Shape{
    private double radius;
   private String name;
   
   //Default Constructor
   public Circle() {
       radius=0.0;
   }
   
   //parameterized Constructor
   public Circle(double r)
   {
   super("Circle");
   radius=r;
   
   }
   // //parameterized Constructor
    Circle(String n) {
       name=n;
    }
    //set radius
    void setRadius(double r)
    {
        radius=r;
    }
    //get radius
    double getRadius()
    {
        return radius;
    }

    //overriding Abstract function
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //overriding Abstract function
    @Override
    public double getPerimeter() {
      return 2.0 * Math.PI * radius;
    }
}
