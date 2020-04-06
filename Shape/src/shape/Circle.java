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
public class Circle extends Shape{
    private double radius;
   private String name;
   
   public Circle() {
       radius=0.0;
   }
   
   
   public Circle(double r)
   {
   super("Circle");
   radius=r;
   
   }

    Circle(String n) {
       name=n;
    }
    void setradius(double r)
    {
        radius=r;
    }
    double getradius()
    {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
      return 2.0 * Math.PI * radius;
    }
}
