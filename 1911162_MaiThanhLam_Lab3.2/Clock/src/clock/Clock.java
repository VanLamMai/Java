/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author Admin
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Clock extends JPanel {
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        g.drawOval(36, 25, 200, 200);
        g.drawString("12", 129, 37);
        g.drawString("3", 228, 125);
        g.drawString("6", 134, 220);
        g.drawString("9", 39, 129);
        g.setColor(Color.red);
        g.drawLine(136, 125, 58, 125);
        g.setColor(Color.blue);
        g.drawLine(136, 125, 136, 183);
        g.setColor(Color.green);
        g.drawLine(136, 125, 186, 135);
        g.setColor(Color.red);
        g.drawString("Hour: 3 Minute: 30 Second: 45", 58, 255);
    }
}