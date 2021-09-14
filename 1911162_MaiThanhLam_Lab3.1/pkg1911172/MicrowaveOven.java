/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1911172;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC124
 */
public class MicrowaveOven extends JFrame implements ActionListener{
    JButton btFood = new JButton("food to be placed here");
    JTextField tfTime = new JTextField("time to be displayed here");
    JButton bt1 = new JButton("1");  JButton bt2 = new JButton("2"); JButton bt3 = new JButton("3"); JButton bt4 = new JButton("4"); 
    JButton bt5 = new JButton("5"); JButton bt6 = new JButton("6"); JButton bt7 = new JButton("7"); JButton bt8 = new JButton("8"); 
    JButton bt9 = new JButton("9"); JButton bt0 = new JButton("0"); JButton btStart = new JButton("Start"); JButton btStop = new JButton("Stop");
public  MicrowaveOven (String title){
    super(title);
    setLayout(new BorderLayout());
    add(btFood, BorderLayout.WEST);
    
    JPanel pMain = new JPanel(new BorderLayout());
    pMain.add(tfTime, BorderLayout.NORTH);
    JPanel pNumber = new JPanel(new GridLayout(4,3));
    pNumber.add(bt1); pNumber.add(bt2);pNumber.add(bt3);pNumber.add(bt5);
    pNumber.add(bt6); pNumber.add(bt7);pNumber.add(bt8);pNumber.add(bt9);
    pNumber.add(bt0); pNumber.add(btStart);pNumber.add(btStop);
    pMain.add(pNumber, BorderLayout.CENTER);
    
    add(pMain, BorderLayout.CENTER);
    
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    bt4.addActionListener(this);
    bt5.addActionListener(this);
    bt6.addActionListener(this);
    bt7.addActionListener(this);
    bt8.addActionListener(this);
    bt9.addActionListener(this);
    bt0.addActionListener(this);
    btStart.addActionListener(this);
    btStop.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource() == bt1){
        tfTime.setText("1");
    }
    else if (e.getSource() == bt2) {
            String s = tfTime.getText() + "2";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt3) {
            String s = tfTime.getText() + "3";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt4) {
            String s = tfTime.getText() + "4";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt5) {
            String s = tfTime.getText() + "5";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt6) {
            String s = tfTime.getText() + "6";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt7) {
            String s = tfTime.getText() + "7";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt8) {
            String s = tfTime.getText() + "8";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt9) {
            String s = tfTime.getText() + "9";
            tfTime.setText(s);
        }
        else if (e.getSource()==bt0) {
            String s = tfTime.getText() + "0";
            tfTime.setText(s);
        }
        else if (e.getSource()==btStart) {
            String s = tfTime.getText() + "";
            tfTime.setText(s);
        }
        else if (e.getSource()==btStop) {
            System.exit(1);
            
        }
}
}
