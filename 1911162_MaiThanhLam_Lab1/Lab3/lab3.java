/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author PC103
 */
public class lab3 {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog
                ("How many number do you need to draw?");
        int k = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog
                ("What is the highest number you can draw?");
        int n = Integer.parseInt(input);
        
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * ( n - i + 1)/ i;
        
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        
        System.exit(0);
    }
}
