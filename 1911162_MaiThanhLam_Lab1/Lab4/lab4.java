/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;


import java.util.*;
import javax.swing.*;

/**
 *
 * @author PC103
 */
public class lab4 {
    public static void main (String[] args)
    {
       String input=JOptionPane.showInputDialog
               ("How many numbers do you need to draw?");
       int k= Integer.parseInt(input);
       
       input = JOptionPane.showInputDialog
               ("What is the highest number you can draw?");
       int n= Integer.parseInt(input);
       
       int[] number = new int[n];
       for (int i= 0; i < number.length; i++)
           number[i]= i + 1;
       int[] result = new int[k];
       for ( int i = 0; i < result.length; i++)
       {
           int r = (int)(Math.random() * n);
           result[i]=number[r];
           
           number[r]=number[n - 1];
           n--;
       }
       Arrays.sort(result);
       System.out.println("Bet the follow combination. It'll make you rich!");
       for (int i = 0; i< result.length;i++)
           System.out.println(result[i]);
       System.exit(0);
    }
}
