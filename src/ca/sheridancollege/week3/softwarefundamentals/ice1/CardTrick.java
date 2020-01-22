/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
import java.lang.Math;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(((int)(Math.random()*13)+1));//number between 1 - 13
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);//insert call to random number between 0-3 here
            
             System.out.println(c);
              
            magicHand[i] = c;
            
          
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Spades");
        
        System.out.println("your lucky card is: " + luckyCard.toString());
    
    for(int i=0; i<magicHand.length; i++){
    
    if ((magicHand[i].getSuit() == luckyCard.getSuit()) && (magicHand[i].getValue() == luckyCard.getValue())){
        System.out.println("lucky card is here");
        break;
}else{
        System.out.println("no lucky card");
    }
 }
        
        
      
       
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
