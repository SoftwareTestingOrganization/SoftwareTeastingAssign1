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
public class Triangle extends Shape{
    private double a,b,c;
    String name;
    
    public Triangle()
    {
        a=0;
        b=0;
        c=0;
    }
    public Triangle(double aa,double bb,double cc)
    {
        a=aa;
        b=bb;
        c=cc;
    }
    public Triangle(String s)
    {
        name=s;
    }
  public void setname(String n)
   {
      name=n;
   }
  public String getname()
   {
     return name;
   }
    
     

    @Override
    public double getArea() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     double s=(a+b+c)/2;
     return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimeter() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return a+b+c;
    }
   
}
