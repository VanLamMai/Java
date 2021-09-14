/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1911172;

import javax.swing.JOptionPane;

/**
 *
 * @author PC103
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog
        ("What is your name?");   
        
        String input = JOptionPane.showInputDialog
        ("How old are you?");
        int age=Integer.parseInt(input);
        
        System.out.println("Hello, "+ name +". Next year, you will be " + (age +1));
        System.exit(0); 
    }
    
}
