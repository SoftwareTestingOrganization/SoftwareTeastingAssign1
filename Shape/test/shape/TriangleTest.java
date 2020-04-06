/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Iqra Ishtiaq
 */
public class TriangleTest {
    
    @Before
    public void getName()
    {
        Shape tri=new Triangle();
        tri.setName("Triangle");
        System.out.println("shape name is:"+tri.getName());
        
    }
    @Test
    public void testGetArea() {
        Shape tri=new Triangle(3,5,4);
        double expected=15;
        double actual=tri.getArea();
        assertNotEquals("area not equal",expected,actual);
       
        
    }

     @Test
    public void testgetPerimeter() {
         Shape tri=new Triangle(3,5,6);
        double expected=12.0;
        double actual=tri.getPerimeter();
        assertNotSame("Value not same",expected,actual);
       
    }
    @After
    
  public void after()
   {
            Shape tri=new Triangle(5.0,6.8,5.0);
            Shape tri1=new Triangle(2.0,3.8,6.0);
            
    System.out.println("area of triangle 1 is:"+tri.getArea()+" "+"Perimeter of triangle 1 is:"+tri.getPerimeter());
    System.out.println("area of triangle 2 is:"+tri.getArea()+" "+"Perimeter of triangle 2 is:"+tri.getPerimeter());
   

    

   }
}
