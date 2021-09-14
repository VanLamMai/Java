/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Admin
 */
public class SimpleServer extends JFrame {
    JTextArea display;
    public SimpleServer( ){
        super("Simple Server");
        Container con = getContentPane( );
        display = new JTextArea(10,30);
        display.setEditable(false);
        con.add(display);
        setSize(400,300);
        setVisible(true);
    }
    public void startServer( ){
        ServerSocket server=null;
        Socket connection=null;
        String message;
        DataInputStream input;
        try{
            server = new ServerSocket (8000);
            while( true){
                connection = server.accept ();
                display.append("Connection established\n");
                input = new DataInputStream (connection.getInputStream () );
                message = input.readUTF();
                display.append("Received message: "+message+"\n");
                connection.close();
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
    public static void main(String[] args) {
        SimpleServer s = new SimpleServer( );
        s.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        s.startServer();
    }
}
