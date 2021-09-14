/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class RainbowPalette extends JPanel implements MouseListener {
    private float selectedHue = 0;
    private Color selectedColor = Color.getHSBColor(0,1,1);
    RainbowPalette(){
        addMouseListener(this);
        setPreferredSize(new Dimension(256, 24));
        setBackground(Color.gray);
    }
    public Color getSelectedColor() {

        return selectedColor;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < width - 8; i++) {
            float hue = (float) i / (width - 8);
            g.setColor(Color.getHSBColor(hue, 1, 1));

            g.drawLine(i + 4, 4, i + 4, height - 5);
        }
        int x = 4 + (int) (selectedHue * (width - 8)); 
        g.setColor(Color.white);
        g.drawRect(x - 2, 3, 2, height - 7); 
        g.drawRect(x - 3, 2, 4, height - 5);
    }
    public void mousePressed(MouseEvent evt)
    {
        int x = evt.getX();
        selectedHue=(float)x/(getSize().width - 4);
        if(selectedHue < 0)
            selectedHue=0;
        else if(selectedHue >1)
            selectedHue=1;
        selectedColor=Color.getHSBColor(selectedHue, 1, 1);
                repaint();
    }
    public void mouseReleased(MouseEvent evt){
        
    }
    public void mouseClicked(MouseEvent evt){
        
    }
    public void mouseEntered(MouseEvent evt) {
        
    }
    public void mouseExited(MouseEvent evt){
        
    }
  
 }

