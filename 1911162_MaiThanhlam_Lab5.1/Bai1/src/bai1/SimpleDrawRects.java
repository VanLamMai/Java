/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class SimpleDrawRects extends JPanel {
   
   
   public static void main(String[] args) {
      JFrame window = new JFrame("SimpleDrawRects");
      SimpleDrawRects content = new SimpleDrawRects();
      window.setContentPane(content);
      window.pack();
      window.setSize(600, 400);
      window.setLocation(100,100);
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.setResizable(false);  
      window.setVisible(true);
   }
   

   
   private RainbowPalette colorInput; 
   

   
   public SimpleDrawRects() {
      setBackground(Color.GRAY);
      setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
      setLayout(new BorderLayout(2,2));
      RectPanel canvas = new RectPanel();
      colorInput = new RainbowPalette();
      add(canvas, BorderLayout.CENTER);
      add(colorInput, BorderLayout.SOUTH);
   }
   
   
   private static class ColoredRect {
      int x, y, width, height;   
      Color color;               
   }
   
   
   
   private class RectPanel extends JPanel
                         implements MouseListener, MouseMotionListener {
      
     
      private ArrayList rects;
      
      
      
      
      private boolean dragging;      
      private ColoredRect dragRect;  
      private int offsetx, offsety;  
                                 
      
      
      RectPanel() {
         setBackground(Color.WHITE);
         setPreferredSize(new Dimension(262,262));
         rects = new ArrayList();
         addMouseListener(this);
         addMouseMotionListener(this);
      }
      
   
      ColoredRect findRect(int x, int y) {
         for (int i = rects.size() - 1;  i >= 0;  i--) {
            ColoredRect rect = (ColoredRect)rects.get(i);
            if ( x >= rect.x && x < rect.x + rect.width
                  && y >= rect.y && y < rect.y + rect.height )
               return rect;  
         }
         return null;
      }
      
      
      void bringToFront(ColoredRect rect) {
         if (rect != null) {
            rects.remove(rect);  
            rects.add(rect);    
            repaint();
         }
      }
      
      
      void deleteRect(ColoredRect rect) {
         if (rect != null) {
            rects.remove(rect);
            repaint();
         }
      }
      
     
      public void paintComponent(Graphics g) {
         super.paintComponent(g); 
         for (int i = 0; i < rects.size(); i++) {
            ColoredRect rect = (ColoredRect)rects.get(i);
            g.setColor(rect.color);
            g.fillRect(rect.x, rect.y, rect.width, rect.height);
            g.setColor(Color.BLACK);
            g.drawRect(rect.x, rect.y, rect.width - 1, rect.height - 1);
         }
      }
      
      
      public void mousePressed(MouseEvent evt) { 
         
         if (dragging)  
            return;
         
         if (evt.isMetaDown() || evt.isControlDown()) {
              
            dragRect = findRect( evt.getX(), evt.getY() );
            if (dragRect != null) {
               dragging = true;   // Begin a drag operation.
               offsetx = evt.getX() - dragRect.x;
               offsety = evt.getY() - dragRect.y;
            }
         }
         else if (evt.isShiftDown()) {
             
            bringToFront( findRect( evt.getX(), evt.getY() ) );
         }
         else if (evt.isAltDown()) {
              
            deleteRect( findRect( evt.getX(), evt.getY() ) );
         }
         else {
              
            ColoredRect rect = new ColoredRect();
            rect.x = evt.getX() - 30;
            rect.y = evt.getY() - 15;
            rect.width = 60;
            rect.height = 30;
            rect.color = colorInput.getSelectedColor();
            rects.add(rect);
            repaint();
         }
         
      } 
      
    
      public void mouseReleased(MouseEvent evt) { 
         if (dragging == false)
            return;
         dragRect = null;
         dragging = false;
      }
      
     
      public void mouseDragged(MouseEvent evt) { 

         if (dragging == false)
            return;
         
         dragRect.x = evt.getX() - offsetx;  
         dragRect.y = evt.getY() - offsety;
         
         
         if (dragRect.x < - dragRect.width / 2)
            dragRect.x = - dragRect.width / 2;
         else if (dragRect.x + dragRect.width/2 > getWidth())
            dragRect.x = getWidth() - dragRect.width / 2;
         if (dragRect.y < - dragRect.height / 2)
            dragRect.y = - dragRect.height / 2;
         else if (dragRect.y + dragRect.height/2 > getHeight())
            dragRect.y = getHeight() - dragRect.height / 2;
         
        
         
         repaint();
         
      }  
      
      public void mouseClicked(MouseEvent evt) { }
      public void mouseEntered(MouseEvent evt) { }
      public void mouseExited(MouseEvent evt) { }
      public void mouseMoved(MouseEvent evt) { }
      
   }  
}