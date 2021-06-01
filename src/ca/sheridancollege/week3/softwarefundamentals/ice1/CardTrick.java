/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Sivagama
 * modifier Shivang Rajnibhai Shingala
 * Student ID: 991600162
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         c.setValue((int) (Math.floor(Math.random() * 12) + 1));
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(Card.SUITS[(int) (Math.floor(Math.random() * 3) + 1)]);
         magicHand[i] = c;
         System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
      }

      //insert code to ask the user for Card value and suit, create their card
      Scanner input = new Scanner(System.in);
      System.out.println("Enter card value and suit: ");
      int cardValue = input.nextInt();
      String cardSuit = input.next();
      System.out.println("The card you chose is " + cardValue + " of " + cardSuit);
      // and search magicHand here

      for (int i = 0; i < 1; i++) {
         if (magicHand[i].getSuit().equals(cardSuit) && magicHand[i].getValue() == cardValue) {
            System.out.println("You got a match!");
         }
         else {
            System.out.println("Sorry! No match!");
         }


      }
   }





   //Then report the result here
}
