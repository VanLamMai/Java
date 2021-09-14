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
public class SnakeEyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dice1, dice2; 
int countRolls; 
countRolls = 0;
do {
dice1 = (int)(Math.random()*6) + 1; 
dice2 = (int)(Math.random()*6) + 1;
countRolls++; 
} while ( dice1 != 1 || dice2 != 1 );
System.out.println("It took " + countRolls + " rolls to get snake eyes.");
    }
    
}
