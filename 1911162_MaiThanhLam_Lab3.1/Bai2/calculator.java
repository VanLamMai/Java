/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class calculator extends JFrame implements ActionListener{
    private JButton btn1, btn2, btn3, btn4;
     private JTextField tf1, tf2, tf3;
      private double result;
       private Container container;
       private JPanel panel1, panel2;
       public calculator(String s) { 
            /*Lấy lớp ContentPane để đặt các đối tượng hiển thị*/
            container = this.getContentPane(); 
      
            /*Tạo các thành phần trên giao diện*/
            JLabel num1 = new JLabel("X = ");
            tf1 = new JTextField();
            JLabel num2 = new JLabel("Y = ");
            tf2 = new JTextField();
            JLabel resultl = new JLabel("Kết quả: ");
            tf3 = new JTextField();
            tf3.setEditable(false);
            
            
 
            /*Panel1 chứa 3 Textfield*/
            panel1 = new JPanel(); 
            /*thiết lập Layout gồm 3 hàng 2 cột*/
            panel1.setLayout(new GridLayout(3,2));
            /*Đặt các thành phần vào panel 1*/
            panel1.add(num1); 
            panel1.add(tf1); 
            panel1.add(num2); 
            panel1.add(tf2);
            panel1.add(resultl);
            panel1.add(tf3);
            /*Tạo 4 nút biểu diễn 4 phép toán*/
            btn1 = new JButton("+");
            btn2= new JButton("-");
            btn3 = new JButton("*");
            btn4 = new JButton(":");
            /*Panel2 chứa 4 nút*/
            panel2 = new JPanel();
            panel2.add(btn1);
            panel2.add(btn2);
            panel2.add(btn3);
            panel2.add(btn4);
 
            /*Đặt 2 panel vào ContentPane*/
            container.add(panel1); 
            container.add(panel2,"South"); 
 
            btn1.addActionListener(this);
            btn2.addActionListener(this); 
            btn3.addActionListener(this); 
            btn4.addActionListener(this);
           
            /*Thiết lập kích thước hiển thị*/
            this.setSize(350, 200);
            this.setVisible(true);
       }
 
       /*Định nghĩa hàm cộng*/
       public void Add() 
       { 
            result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()); 
            tf3.setText(String.valueOf(result)); 
       }
       /*Định nghĩa hàm trừ*/
       public void Minus() 
       { 
            result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
            tf3.setText(String.valueOf(result));
       }
       /*Định nghĩa hàm nhân*/
       public void Multi() 
       {
            result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
            tf3.setText(String.valueOf(result)); 
       }
       /*Định nghĩa hàm chia*/
       public void Div()
       {
           result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
           tf3.setText(String.valueOf(result));
       } 
      
       /*Bắt đầu tính toán khi người dùng ấn các nút phép toán*/
       public void actionPerformed(ActionEvent e) 
       { 
            if (e.getActionCommand()=="+") {
                //Xử lý trường hợp chưa nhập số nhưng đã bấm tính toán
                if(tf1.getText().equals("") || tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Add();
                }
            }
               
            if (e.getActionCommand()=="-") {
                if(tf1.getText().equals("")|| tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Minus();
                }
            }
            if (e.getActionCommand()=="*"){
                if(tf1.getText().equals("")|| tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Multi();
                }
            }               
            if (e.getActionCommand()==":") {
                if(tf1.getText().equals("")|| tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Div();
                }
            }               
       }
        
}

