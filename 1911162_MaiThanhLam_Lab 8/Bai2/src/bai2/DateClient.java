/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Admin
 */
public class DateClient extends JFrame implements ActionListener{
    JTextField theDate;
    JButton getDate;public DateClient( ) {
        super("Date Client");
        Container con = getContentPane( );
        con.setLayout( new FlowLayout( ) );
        theDate = new JTextField(15);
        con.add(theDate);
        getDate = new JButton("What is the date?");
        getDate.addActionListener(this);
        con.add(getDate);
        setSize(200,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent action) {
        String date;
        Socket client = null;
        DataOutputStream output;
        DataInputStream input;
        try {
            client = new Socket( InetAddress.getLocalHost(),8000);
            output = new DataOutputStream( client.getOutputStream() );
            output.writeUTF("Give me the date");
            input = new DataInputStream( client.getInputStream() );
            date = input.readUTF( );
            theDate.setText( date );
        } catch(IOException e) { e.printStackTrace(); }
    }
    public static void main(String args[ ] ) {
        DateClient c = new DateClient();
        c.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
