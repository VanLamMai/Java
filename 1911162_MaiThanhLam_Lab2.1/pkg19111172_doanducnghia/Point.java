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
public class Point {
    protected int x, y; 


 public Point()
 {

 setPoint( 0, 0 );
 }

 public Point( int a, int b )
 {

 setPoint( a, b );
 }

 public void setPoint( int a, int b )
 {
 x = a;
 y = b;
 }

 public int getX() { return x; }

}
 


