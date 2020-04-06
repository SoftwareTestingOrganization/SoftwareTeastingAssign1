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
public class Rectangle extends Shape {

    
   private double width,height;
   private String name;
   
   public Rectangle() {
       width=0.00;
       height=0.0;
   }
   
   
   public Rectangle(double w,double h)
   {
   super("Rectangle");
   width=w;
   height=h;
   
   }

    Rectangle(String n) {
       name=n;
    }

    
        
   
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
      return 2.0*(width+height);
    }
    
}
