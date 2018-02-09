package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

/**Purpose: This program to initialize deck of cards having suit 
 * ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", 
 * "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
 * Shuffle the cards using Random method and then distribute 9 Cards
 * to 4 Players and Print the Cards the received by the 4 Players 
 * @author SANA SHAIKH
 * @since 15/01/2018
 */
public class DeckOfCards
{
	public static void main(String[] args) 
	{
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};
		
		Utility.deckOfCards(suits,ranks);
		
	}
}