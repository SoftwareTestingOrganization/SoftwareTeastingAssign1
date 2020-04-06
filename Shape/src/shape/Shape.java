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

//Shape class
public abstract class Shape {

 //attribute of class Shape
 private String name;
 
 //Default Constructor of Shape
 public Shape()
 {
    name = "";
  }
 
  //Parameterized Constructor of Shape
 public Shape(String n)
 {
     name=n;
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
 //abstract methods
 
 public abstract double getArea();
 public abstract double getPerimeter();
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    

   
    
}
