/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import static java.lang.Byte.MAX_VALUE;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Nabiya Fatima
 */
public class QuadraticEquation {

    int a;
    int b;
    int c;
    int disc;
    public void setValues(int x,int y,int z)
    {
        this.a=x;
        this.b=y;
        this.c=z;
    }
    public String CheckRoots()
    {
       if(isQuadratic())
       {
        disc=calculateDisc();
        if(disc>0)
        {
            return "real";
        }
        else if(disc==0)
        {
            return "equal";
        }
        else if (disc<0)
        {
            return "imaginary";
        }
       }
        return null;
    }
    public double RootsSum()
    {
        double Sum=0;
        if(isQuadratic())
        {
            Sum=(-b)/a;
        }
      
        
        return Sum;
    }
    public int RootProduct()
    {
        int product=0;
        if(isQuadratic())
        {
             product=c/a;
        }
       
      
       
        return product;
    }
    public double[] calculateRoots()
    {
        double root1=0,root2=0;
         double result[]=new double[2];
         if(isQuadratic())
       {
        disc=calculateDisc();
        if(disc>0)
        {
            root1 = (-b + Math.sqrt(disc)) / (2 * a);
            root2 = (-b - Math.sqrt(disc)) / (2 * a);
            result[0]=root1;
        result[1]=root2;

        }
        else if(disc==0)
        {
             root1 = root2 = -b / (2 * a);
             result[0]=root1;
        result[1]=root2;
        }
        else if(disc<0)
        {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-disc) / (2 * a);
            result[0]=realPart;
        result[1]=imaginaryPart;
       
        }
       }
       
        
        return result;
        
        
    }
    public int calculateDisc()
    {
        int res=MAX_VALUE;
        if(isQuadratic())
        {
            res=b*b-4*a*c;
        }
        return res;
    }
    public boolean isQuadratic()
    {
        boolean flag=false;
        if(a!=0)
        {
            flag=true;
        }
        return flag;
    }
   
    public void display()
    { QuadraticEquation e=new QuadraticEquation();
        double roots[]=new double[2];
         roots=calculateRoots();
       
        if(calculateDisc()>0)
        {
          System.out.println("root1 = "+roots[0]);
          System.out.println("root2 = "+roots[1]);   
        }
         if(calculateDisc()==0)
        {
          System.out.println("root1 = root2 = "+roots[0]);
           
        }
          if(calculateDisc()<0)
        {
          System.out.println("root1 = "+roots[0]+"+"+roots[1]+"i");
            System.out.println("root1 = "+roots[0]+"-"+roots[1]+"i");
        }
    }
    public void takeInput()
    {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a ");
                a=in.nextInt();
                System.out.println("Enter the values of b ");
                b=in.nextInt();
                System.out.println("Enter the values of c ");
                c=in.nextInt();
                setValues(a,b,c);
    }
    public static void main(String[] args) {
        QuadraticEquation e=new QuadraticEquation();
        System.out.println("1) calculate Roots");
        System.out.println("2) calculate Sum of Roots");
        System.out.println("3) calculate Product Of Roots");
        System.out.println("4) Check Equation is Quadratic?");
           int choice=0;
           
           Scanner in = new Scanner(System.in);
          
             
           try  
        {  
         choice=in.nextInt();
        }  
            //handling the exception  
        catch(InputMismatchException w)  
        {  
            System.out.println("Invalid choice");  
        }  
           
        switch(choice)
        {
            case 1:
            {
                e.takeInput();
                
              if(e.isQuadratic())
              {
                e.display();
                 
              }
              else
              {
               System.out.println("Not a Quadratic Equation");
              }
              break;
            }
            case 2:
            {
                e.takeInput();
                 if(e.isQuadratic())
              {
                  System.out.println(e.RootsSum());
                 
              }
              else
              {
               System.out.println("Not a Quadratic Equation");
              }
                 break;
            }
            case 3:
            {
                e.takeInput();
                 if(e.isQuadratic())
              {
                  System.out.println(e.RootProduct());
                 
              }
              else
              {
               System.out.println("Not a Quadratic Equation");
              }
                 break;
            }
            case 4:
            {
                e.takeInput();
                 if(e.isQuadratic())
              {
                 
                  System.out.println("Quadratic Equation");
                 
              }
              else
              {
               System.out.println("Not a Quadratic Equation");
              }
                 break;
            }
             default:
            {
                System.out.println("Invalid Choice");
            }
            
        }
    }
    
}
