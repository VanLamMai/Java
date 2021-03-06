/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_4;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author PC124
 */
public class Bai1_4 {
    public static void main( String args[] )
 {
 Point point = new Point( 7, 11 );
 Circle circle = new Circle( 3.5, 22, 8 );
 Cylinder cylinder = new Cylinder( 10, 3.3, 10, 10 );

 Shape arrayOfShapes[];

 arrayOfShapes = new Shape[ 3 ];

 arrayOfShapes[ 0 ] = point;

 arrayOfShapes[ 1 ] = circle;

 arrayOfShapes[ 2 ] = cylinder;

 String output =
 point.getName() + ": " + point.toString() + "\n" +
 circle.getName() + ": " + circle.toString() + "\n" +
 cylinder.getName() + ": " + cylinder.toString();

 DecimalFormat precision2 = new DecimalFormat( "0.00" );
 
 for ( int i = 0; i < arrayOfShapes.length; i++ ) {
 output += "\n\n" +
 arrayOfShapes[ i ].getName() + ": " +
 arrayOfShapes[ i ].toString() +
 "\nArea = " +
 precision2.format( arrayOfShapes[ i ].area() ) +
 "\nVolume = " +
 precision2.format( arrayOfShapes[ i ].volume() );
 }

 JOptionPane.showMessageDialog( null, output,
 "Demonstrating Polymorphism",
JOptionPane.INFORMATION_MESSAGE );

 System.exit( 0 );
}
}
