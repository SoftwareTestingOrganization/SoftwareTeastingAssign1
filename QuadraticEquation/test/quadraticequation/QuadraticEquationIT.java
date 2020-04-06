/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 *
 * @author Nabiya Fatima
 */
public class QuadraticEquationIT {
    QuadraticEquation e=new QuadraticEquation();
     QuadraticEquation e1=new QuadraticEquation();
      QuadraticEquation e2=new QuadraticEquation();
       QuadraticEquation e3=new QuadraticEquation();
       QuadraticEquation e4=new QuadraticEquation();
      QuadraticEquation e5=new QuadraticEquation();
       QuadraticEquation e6=new QuadraticEquation();
      
   
    
    @Before
    public void setUp() {
       e.setValues (1, 0, 0);
       e1.setValues (1, 2, 1);
       e2.setValues (1, 4, 5);
       e3.setValues(1, 3, 2);
       e4.setValues(0, 1, 2);
       e5.setValues(0, 0, 0);
       e6.setValues(0, 0, 1);
       
    }
     @After
    public void tearDown() {
     System.out.println("Function tested Successfully");
       
    }
    @RunWith(Parameterized.class)
public class root {
   private Integer a;
  private Integer b;
  private Integer c;
  private Integer expected;
   
   @Before
   public void initialize() {
      
   }
	
   public root(int a,int b,int c,int expected) {
      this.a=a;
      this.b=b;
      this.c=c;
      this.expected=expected;
   }

   @Parameterized.Parameters
   public  Collection values() {
      return Arrays.asList(new Object[][] {
         { 1,2,1,0 },
         { 1,4,5,-4 },
         { 1,3,2,1 }
         
      });
   }

   @Test
   public void testCalculateDisc() {
    
     QuadraticEquation q=new QuadraticEquation();
     q.setValues(a, b, c);
     int result=q.calculateDisc();
     assertEquals(expected,result,0.0000);
   }
}
     
    @Test 
    public void TestCheckRoots()
    {
        String res1=e1.CheckRoots();
        String res2=e2.CheckRoots();
        String res3=e3.CheckRoots();
        assertNull("Not a Quadratic Equation",e6.CheckRoots());
        assertNull("Not a Quadratic Equation",e4.CheckRoots());
        assertNull("Not a Quadratic Equation",e5.CheckRoots());
        assertNotNull("Quadratic Equation",e1.CheckRoots());
        assertNotNull("Quadratic Equation",e2.CheckRoots());
        assertNotNull("Quadratic Equation",e3.CheckRoots());
        assertSame("The roots are equal","equal", res1);

        assertSame("The roots are imaginary","imaginary", res2);
        assertSame("The roots are real","real", res3);
        assertNotSame("The roots are not equal","equal", res2);
        assertNotSame("The roots are not imaginary","imaginary", res3);
        assertNotSame("The roots are  not real","real", res1);
       
    }
     @Test 
    public void TestIsQuadratic()
    {
        boolean res1=e1.isQuadratic();
        boolean res2=e2.isQuadratic();
        boolean res3=e3.isQuadratic();
        assertTrue("Quadratic Equation",res1);
        assertTrue("Quadratic Equation",res1);
        assertTrue("Quadratic Equation",res1);
        assertFalse("Not a Quadratic Equation",e4.isQuadratic());
        assertFalse("Not a Quadratic Equation",e5.isQuadratic());
        assertFalse("Not a Quadratic Equation",e6.isQuadratic());
      
    }
    
    @Test
    public void TestRootsSum()
    {
        
        assertEquals(-2,e1.RootsSum(),0.0000);
        assertEquals(-4.0,e2.RootsSum(),0.0000);
        assertEquals(-3.0,e3.RootsSum(),0.0000);
        assertNotEquals(-2,e4.RootsSum(),0.0000);
        assertNotEquals(-4.0,e5.RootsSum(),0.0000);
        assertNotEquals(-3.0,e6.RootsSum(),0.0000);
    }
   
    
    @Test
    public void TestRootProduct()
    {
        
        assertEquals(1,e1.RootProduct());
        assertEquals(5,e2.RootProduct());
        assertEquals(2,e3.RootProduct());
        assertNotEquals(-2,e4.RootProduct());
        assertNotEquals(-4.0,e5.RootProduct());
        assertNotEquals(-3.0,e6.RootProduct());
    }
  
    
    @Test
    public void TestCalculateRoots()
    {
        double []expected=new double[2];
        expected[0]=expected[1]=-1;  
        double res[]=e1.calculateRoots();
        assertArrayEquals("Equal roots",expected,res,0.0000);
      
        expected[0]=-2;expected[1]=1; 
        res=e2.calculateRoots();
        assertArrayEquals("Imaginary roots",expected,res,0.0000);
        
        expected[0]=-1;expected[1]=-2; 
        res=e3.calculateRoots();
        assertArrayEquals("Real roots",expected,res,0.0000);
    }
    
    
     @RepeatedTest(3)
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
         assertEquals(5, repetitionInfo.getTotalRepetitions());
         e3.setValues(-2, 7, 4);
         double []expected=new double[2];
         double res[]=new double[2];
        if(repetitionInfo.getCurrentRepetition()==1)
        {
         expected[0]=expected[1]=-1;  
         res=e1.calculateRoots();
         assertArrayEquals("Equal roots",expected,res,0.0000);
        }
         
      if(repetitionInfo.getCurrentRepetition()==2)
      {
         expected[0]=-2;expected[1]=1; 
         res=e2.calculateRoots();
         assertArrayEquals("Imaginary roots",expected,res,0.0000);
      }
      if(repetitionInfo.getCurrentRepetition()==3)
      {
         expected[0]=-4;expected[1]=-0.5; 
         res=e3.calculateRoots();
         assertArrayEquals("Real roots",expected,res,0.0000);
      }
       
    }
   
 

}
