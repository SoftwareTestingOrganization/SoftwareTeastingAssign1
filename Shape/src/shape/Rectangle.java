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
//Rectangle class which is inherited from Shape Class
public class Rectangle extends Shape {

    
   private double width,height;
   private String name;
   
   //Default Constructor
   public Rectangle() {
       width=0.00;
       height=0.0;
   }
   
   //Parameterized Constructor
   public Rectangle(double w,double h)
   {
  
   width=w;
   height=h;
   
   }
	//Parameterized Constructor
    Rectangle(String n) 
    {
       name=n;
    }

    
        
    //Overriding abstarct function
    @Override
    public double getArea() {
        return width*height;
    }
    
    //Overriding abstarct function
    @Override
    public double getPerimeter() {
      return 2.0*(width+height);
    }
    
}
