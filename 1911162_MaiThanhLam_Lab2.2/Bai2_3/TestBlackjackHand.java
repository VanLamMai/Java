/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_3;

/**
 *
 * @author PC124
 */
public class TestBlackjackHand {
    public static void main(String[] args) {
    Deck deck; 
    Card card; 
    BlackjackHand hand; 
    int cardsInHand; 
    boolean again; 
    deck = new Deck(); 
        do {
    deck.shuffle();
        hand = new BlackjackHand();
        cardsInHand = 2 + (int)(Math.random()*5);
    System.out.println();
    System.out.println();
    System.out.println("Hand contains:");
    for ( int i = 1; i <= cardsInHand; i++ ) {

        card = deck.dealCard();
        hand.addCard(card);
        System.out.println(" " + card);
    }
        System.out.println("Value of hand is " +
        hand.getBlackjackValue());
        System.out.println();
        System.out.print("Again? ");
        again = TextIO.getlnBoolean();
        } while (again == true);
    }
}
