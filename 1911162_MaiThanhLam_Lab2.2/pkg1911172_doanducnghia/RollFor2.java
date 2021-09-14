/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1911172_doanducnghia;

/**
 *
 * @author PC124
 */
public class RollFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PairOfDice dice;
        int rollCount;
        dice = new PairOfDice();
        rollCount=0;
        do{
            dice.roll();
            System.out.println("The dice come up" + dice);
            rollCount++;
            
        }while (dice.getTotal() != 2);
        System.out.println("\nIt took" + rollCount +"rolls to get a 2.");
        System.out.println();
        System.out.println("This program will now crash with an error");
        System.out.println("when it tries to set the value of a die to 42.");
        System.out.println();
        dice.setDie1(42);
        System.out.println(dice);
    }
    
}
