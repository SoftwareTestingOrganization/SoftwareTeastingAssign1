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
//Triangle class which is inherited from Shape Class
public class Triangle extends Shape{
    //Attributes of class Triangle
    private double a,b,c;
    String name;
    
    //Triangle default constructor
    public Triangle()
    {
        a=0;
        b=0;
        c=0;
    }
    //Parameterized Constructor
    public Triangle(double aa,double bb,double cc)
    {
        a=aa;
        b=bb;
        c=cc;
    }
    //Parameterized Constructor
    public Triangle(String s)
    {
        name=s;
    }
    //setter
     public void setName(String n)
    {
      name=n;
    }
     //getter
    public String getName()
 	{
     return name;
	}
   }
    
     
    //abstract function overriding
    @Override
    public double getArea() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     double s=(a+b+c)/2;
     return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    //abstract function overriding
    @Override
    public double getPerimeter() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return a+b+c;
    }
   
}
