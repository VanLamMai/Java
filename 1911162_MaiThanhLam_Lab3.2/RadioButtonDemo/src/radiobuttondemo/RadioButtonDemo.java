/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobuttondemo;

/**
 *
 * @author Admin
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener{
    JRadioButton redRadio, blueRadio, greenRadio, blackRadio;
    
    JLabel label;
    
    public RadioButtonDemo(){
        getContentPane().setLayout( new GridLayout(5,1) );
        
        ButtonGroup colorGroup = new ButtonGroup();
        
        redRadio = new JRadioButton("Red");
        colorGroup.add(redRadio);
        redRadio.addActionListener(this);
        getContentPane().add(redRadio);
        
        blueRadio = new JRadioButton("Blue");
        colorGroup.add(blueRadio);
        blueRadio.addActionListener(this);
        getContentPane().add(blueRadio);
        
        greenRadio = new JRadioButton("Green");
        colorGroup.add(greenRadio);
        greenRadio.addActionListener(this);
        getContentPane().add(greenRadio);
        
        blackRadio = new JRadioButton("Black");
        colorGroup.add(blackRadio);
        blackRadio.addActionListener(this);
        getContentPane().add(blackRadio);
        
        redRadio.setSelected(true);
        
        label = new JLabel("Red is selected", JLabel.CENTER);
        label.setForeground(Color.white);
        label.setBackground(Color.red);
        label.setOpaque(true);
        getContentPane().add(label);
        
    }
    public void actionPerformed(ActionEvent evt){
        if(redRadio.isSelected()){
            label.setBackground(Color.red);
            label.setText("Red is selected");
        }
        else if(greenRadio.isSelected()){
            label.setBackground(Color.green);
            label.setText("Green is selected");
        }
        else if ( blueRadio.isSelected() ){
            label.setBackground(Color.blue);
            label.setText("Blue is selected");
        }
        else if ( blackRadio.isSelected() ){
            label.setBackground(Color.black);
            label.setText("Black is selected");
        }
    }
    
}
