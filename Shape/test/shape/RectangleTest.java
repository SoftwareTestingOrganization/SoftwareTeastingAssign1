/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author Iqra Ishtiaq
 */

public class RectangleTest {
     @Before
    public void getName() {
    
    Shape rec=new Rectangle();
        rec.setName("Rectangle");
        System.out.println("shape name is:"+rec.getName());
    
  
        
    }
    
    

    
     @Test
    public void testGetArea() {
        Shape rec=new Rectangle(3,5);
        double expected=15;
        double actual=rec.getArea();
        assertEquals(expected,actual,0.0001);
       
        
    }

     @Test
    public void testgetPerimeter() {
         Shape rec=new Rectangle(3,5);
        double expected=15;
        double actual=rec.getPerimeter();
        assertNotSame("Value not equal",expected,actual);
       
    }
   
     @Test
  public void compareArea()
  {
      //double sum = 0;
      Shape rec=new Rectangle(4,5);
      Shape rec1=new Rectangle(3,2);
     
      System.out.println("comparing area of Retangle 1:"+rec.getArea()+"  "+"comparing  area of Retangle 2"+rec1.getArea());
      assertFalse(rec.getArea()==rec1.getArea());
      
  }
   
  
   @Test
  public void comparePerimter()
  {
     // double sum = 0;
      Shape rec=new Rectangle(4,5);
      Shape rec1=new Rectangle(3,2);
     
      System.out.println("comparing perimeter of rectangle 1:"+rec.getPerimeter()+"  "+"comparing rectangle  of Retangle 2:"+rec1.getPerimeter());
      assertTrue(!(rec.getPerimeter()==rec1.getPerimeter()));
      
  }
  
    
  @After
    
  public void after()
   {
            Shape rec=new Rectangle(5.0,6.8);
            
            System.out.println("area of circle is:"+rec.getArea()+" "+"Perimeter of circle is:"+rec.getPerimeter());
   }

    
    
    
  
    
}
