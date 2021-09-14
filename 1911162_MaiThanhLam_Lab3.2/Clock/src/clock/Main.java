/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame f = new JFrame("Display Clock");
        Clock cl = new Clock();
        f.setLayout(new BorderLayout());
        f.getContentPane().add(cl, BorderLayout.CENTER);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLocation(d.width/2 - cl.getWidth()/2, d.height/2 - cl.getHeight()/2);
    }
}
