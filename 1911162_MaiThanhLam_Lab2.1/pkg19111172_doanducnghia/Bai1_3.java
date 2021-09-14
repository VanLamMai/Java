/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19111172_doanducnghia;

import java.text.DecimalFormat;
 import javax.swing.JOptionPane;
/**
 *
 * @author PC124
 */
public class Bai1_3 {

 public static void main( String args[] )
 {
 Point pointRef, p;
 Circle circleRef, c;
 String output;

 p = new Point( 30, 50 );
 c = new Circle( 2.7, 120, 89 );

 output = "Point p: " + p.toString() +
 "\nCircle c: " + c.toString();

 pointRef = c;

output += "\n\nCircle c (via pointRef): " +
 pointRef.toString();

 circleRef = (Circle) pointRef;

 output += "\n\nCircle c (via circleRef): " +
 circleRef.toString();


 DecimalFormat precision2 = new DecimalFormat( "0.00" );
 output += "\nArea of c (via circleRef): " +
 precision2.format( circleRef.area() );


 if ( p instanceof Circle ) {
 circleRef = (Circle) p; 
 output += "\n\ncast successful";
 }
 else
 output += "\n\np does not refer to a Circle";

 JOptionPane.showMessageDialog( null, output,
 "Demonstrating the \"is a\" relationship",
 JOptionPane.INFORMATION_MESSAGE );

 System.exit( 0 );
 }
}
