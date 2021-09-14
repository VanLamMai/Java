/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
/**
 *
 * @author Admin
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        RGBColorChooser f = new RGBColorChooser();
        f.setSize(300,100);
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
