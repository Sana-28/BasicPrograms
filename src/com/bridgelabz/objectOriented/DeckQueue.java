package com.bridgelabz.objectOriented;

import com.bridgelabz.util.Utility;

/**Purpose: This program is to display deck cards using
 * Queue.
 * @author SANA SHAIKH
 * @since 15/01/2018
 */
public class DeckQueue
{
	public static void main(String[] args) 
	{
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};
		
		Utility.deckOfCardsQueue(suits,ranks);
		
	}
}