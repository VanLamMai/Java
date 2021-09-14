/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Admin
 */
public class KeyboardAndFocusDemo extends JFrame implements KeyListener, FocusListener, MouseListener{
    static final int SQUARE_SIZE = 40;
    Color squareColor;
    int squareTop, squareLeft;
    boolean focussed = false;
    DisplayPanel canvas;

    public KeyboardAndFocusDemo() {
        squareTop = getSize().height / 2 - SQUARE_SIZE / 2;
        squareLeft = getSize().width / 2 - SQUARE_SIZE / 2;
        squareColor = Color.RED;
        canvas = new DisplayPanel();
        setContentPane(canvas);
        canvas.setBackground(Color.WHITE);
        canvas.addFocusListener(this);
        canvas.addKeyListener(this);
        canvas.addMouseListener(this);
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        char ch = evt.getKeyChar();
        
        if (ch == 'B' || ch == 'b') {
            squareColor = Color.BLUE;
            canvas.repaint();
        } else if (ch == 'G' || ch == 'g') {
            squareColor = Color.green;
            canvas.repaint();
        } else if (ch == 'R' || ch == 'r') {
            squareColor = Color.red;
            canvas.repaint();
        } else if (ch == 'K' || ch == 'k') {
            squareColor = Color.black;
            canvas.repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            squareLeft -= 8;
            if (squareLeft < 3)
                squareLeft = 3;
            canvas.repaint();
        }
        else if (key == KeyEvent.VK_RIGHT) {
            squareLeft += 8;
            if (squareLeft > getSize().width - 3 - SQUARE_SIZE - 16)
                squareLeft = getSize().width - 3 - SQUARE_SIZE - 16;
            canvas.repaint();
        }
        else if (key == KeyEvent.VK_UP) {
            squareTop -= 8;
            if (squareTop < 3)
                squareTop = 3;
            canvas.repaint();
        }
        else if (key == KeyEvent.VK_DOWN) {
            squareTop += 8;
            if (squareTop > getSize().height - 3 - SQUARE_SIZE - 39)
                squareTop = getSize().height - 3 - SQUARE_SIZE - 39;
            canvas.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void focusGained(FocusEvent evt) {
        focussed = true;
        canvas.repaint();
    }

    @Override
    public void focusLost(FocusEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent evt) {
        canvas.requestFocus();
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
      
    class DisplayPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if (focussed)
                g.setColor(Color.CYAN);
            else
                g.setColor(Color.LIGHT_GRAY);
            
            int width = getSize().width;
            int height = getSize().height;
            
            g.drawRect(0, 0, width - 1, height - 1);
            g.drawRect(1, 1, width - 3, height - 3);
            g.drawRect(2, 2, width - 5, height - 5);
            
            g.setColor(squareColor);
            g.fillRect(squareLeft, squareTop, SQUARE_SIZE, SQUARE_SIZE);
            
            if (!focussed) {
                g.setColor(Color.MAGENTA);
                g.drawString("Click to activate", 20, 20);
            }
        }           
    }    
}
