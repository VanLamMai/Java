/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickablecheckerboard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class ClickableCheckerboard extends JPanel implements MouseListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Clickable Checkerboard");
        ClickableCheckerboard content = new ClickableCheckerboard();
        window.setContentPane(content);
        window.pack();
        window.setLocation(100,100);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setResizable(false);
        window.setVisible(true);
    }
    int selectedRow;
    int selectedCol;
    public ClickableCheckerboard(){
        selectedRow = -1;
        addMouseListener(this);
        setPreferredSize( new Dimension(160,160) );
    }
    public void paintComponent(Graphics g){
        int row;
        int col;
        int x,y;
        for ( row = 0; row < 8; row++ ){
            for ( col = 0; col < 8; col++){
                x = col * 20;
                y = row * 20;
                if ( (row % 2) == (col % 2) )
                    g.setColor(Color.red);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            }
        }
        if (selectedRow >= 0){
            g.setColor(Color.CYAN);
            y = selectedRow * 20;
            x = selectedCol * 20;
            g.drawRect(x, y, 19, 19);
            g.drawRect(x+1, y+1, 17, 17);
        }
    }
    public void mousePressed(MouseEvent evt){
        int col = evt.getX() / 20;
        int row = evt.getY() / 20;
        if (selectedRow == row && selectedCol == col){
            selectedRow = -1;
        }
        else{
            selectedRow = row;
            selectedCol = col;
        }
        repaint();
    }
    public void mouseReleased(MouseEvent evt){ }
    public void mouseClicked(MouseEvent evt) { }
    public void mouseEntered(MouseEvent evt) { }
    public void mouseExited(MouseEvent evt) { }
}
