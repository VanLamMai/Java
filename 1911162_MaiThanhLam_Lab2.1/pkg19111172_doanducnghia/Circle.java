/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19111172_doanducnghia;

/**
 *
 * @author PC124
 */


 public class Circle extends Point { 
 protected double radius;

 public Circle()
 {

 setRadius( 0 );
 }

 public Circle( double r, int a, int b )
 {
 super( a, b ); 
 setRadius( r );
 }

 public void setRadius( double r )
 { radius = ( r >= 0.0 ? r : 0.0 ); }

 public double getRadius() { return radius; }

 
 public double area() { return Math.PI * radius * radius; }


 public String toString()
 {
 return "Center = " + "[" + x + ", " + y + "]" +
 "; Radius = " + radius;
 }
 }


