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
public class CircleTest {
    
    @Before
    public void getName() {
    
     Shape rec=new Rectangle();
        rec.setName("Circle");
        System.out.println("shape name is:"+rec.getName());
   
  
        
    }
    /**
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
         Shape rec=new Circle(3);
        double expected=28.2;
        double actual=rec.getArea();
        assertNotEquals(expected,actual,0.0001);
    }

    /**
     * Test of getPerimeter method, of class Circle.
     */
    @Test
    public void testGetPerimeter() {
          Shape rec=new Circle(5);
        double expected=30;
        double actual=rec.getPerimeter();
        assertNotSame(expected,actual);
    }
    @Test
    public void error()
    { 
        double r=0;
        double ans=0;
        Shape rec=new Circle(5);
        try
        {
           ans= rec.getArea()/r;
        }
        catch(ArithmeticException e )
        {
            fail("Exception occur");
        }
        
    }
    
    
    @After
    
        public void after()
        {
            Shape cir=new Circle(5.0);
            
            System.out.println("area of circle is:"+cir.getArea()+" "+"Perimeter of circle is:"+cir.getPerimeter());
        }
    
    
}
