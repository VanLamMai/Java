/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SimpleStats {
    public static void main(String[] args){
    Scanner in = new  Scanner(System.in);
    StatCalc calc;
    calc = new StatCalc();
    double item;
    System.out.println("Enter your numbers. Enter 0 to end.");
    System.out.println();
    do{
        System.out.print("? ");
        item = in.nextDouble();
        if(item != 0)
            calc.enter(item);
    }while (item != 0);
    System.out.println("\nStatistics about your calc:\n");
    System.out.println(" count: "+ calc.getCount());
    System.out.println(" Sum: "+ calc.getSum());
    System.out.println(" Maximum: "+calc.getMax());
    System.out.println(" Average:  "+calc.getMean());
    System.out.println(" Standard Deviation : " + calc.getStandarDeviation());
    
   }
}
