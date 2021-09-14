/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobuttondemo;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author ADMIN
 */

public class Main {
    public static void main(String[]args){
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        RadioButtonDemo f = new RadioButtonDemo();
        f.setSize(500, 200);
        f.setLocation(d.width/2-f.getWidth()/2, d.height/2-f.getHeight()/2);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
         @Override 
         public void windowClosing(WindowEvent e){
             System.exit(1);
         }
      });
    }
}
