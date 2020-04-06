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
public abstract class Shape {
 private String name;
 
 public Shape()
 {
    name = "";
  }
 
 public Shape(String n)
 {
     name=n;
 }
 public void setName(String n)
 {
     name=n;
 }
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
