/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author PC103
 */
public class lab2 {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog
                ("How much money do you need to retire?");
        double  goal=Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog
                ("How much money do you contribute every year?");
        double payment=Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog
                ("Interest rate in %:");
        double interestRate= Double.parseDouble(input);
        
        double balance = 0;
        int years = 0;
        
        while (balance < goal)
        {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            
            years++;
        }
        System.out.println(" your retire in " + years +" years.");
        System.exit(0);
    }
}
