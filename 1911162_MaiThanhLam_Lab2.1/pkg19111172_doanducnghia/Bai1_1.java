/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19111172_doanducnghia;

import java.util.Scanner;

/**
 *
 * @author PC124
 */
public class Bai1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       String line;
        int i; 
        char ch; 
        boolean didCR; 
        System.out.println("Enter a line of text.");
        System.out.print("? ");
        line = input.nextLine();
        System.out.println();
        didCR = true;
        for ( i = 0; i < line.length(); i++ ) {
        ch = line.charAt(i);
        if ( Character.isLetter(ch) ) {
        System.out.print(ch);
        didCR = false;
        }
        else {
        if ( didCR == false ) {
        System.out.println();
        didCR = true;
            }
           }
          }
            System.out.println(); 
    }  
    
}
