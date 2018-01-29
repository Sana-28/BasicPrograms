/***********************************************
 * Purpose :This program is to play a game Tic-Tac Toe        
 * @author  Sana Shaikh
 * @version 1.0
 * @since   13/01/2018         
 ***********************************************/

package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class TicTacToe
{
	public static void main(String args[])
	{
		int board[][]=new int[3][3];
		initializeBoard();
		printBoard();
		/*int choice;
	Scanner scanner=new Scanner(System.in);

	System.out.println("Where do you want to insert?");
	System.out.println("Enter row number:");
	int row=scanner.nextInt();
	System.out.println("Enter column number:");
	int col=scanner.nextInt();
		 */
	}
	public static void initializeBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				java.lang.String[][] array = null;
				array[i][j]="0";
			}
		}
	}
	public static void printBoard()
	{
		System.out.println("-----");
		for(int i=0; i<3;i++)
		{
			System.out.println("|");
			for(int j=0;j<3;j++)
			{
				java.lang.String[][] board = null;
				System.out.println(board[i][j]+ "|");
			}
			System.out.println();
			System.out.println("-------");
		}

	}
}
