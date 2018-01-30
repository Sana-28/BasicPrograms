package com.bridgelabz.functional;

import java.util.Scanner;

/**
 * Purpose: This program is to play a game Tic-Tac Toe, Player 1 is the X and
 * the Player 2 is the 0
 * 
 * @author: Sana Shaikh
 * @since: 13/01/2018
 */
public class TicTacToe {
	public static final int EMPTY = 0;
	public static final int CROSS = 2;
	public static final int NOT = 1;

	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int NOT_WON = 3;

	public static final int ROWS = 3, COLS = 3;
	public static int[][] board = new int[ROWS][COLS];
	public static int currentState;
	public static int currentPlayer;
	public static int currntRow, currentCol;

	public static Scanner scanner = new Scanner(System.in);

	/**
	 * This is main method for Tic-Tac-Toe program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		initGame();
		do {
			playerMove(currentPlayer);
			updateGame(currentPlayer, currntRow, currentCol);
			printBoard();

			if (currentState == CROSS_WON) {
				System.out.println("'X' won! Bye!");
			} else if (currentState == NOT_WON) {
				System.out.println("'O' won! Bye!");
			} else if (currentState == DRAW) {
				System.out.println("It's a Draw! Bye!");
			}

			currentPlayer = (currentPlayer == CROSS) ? NOT : CROSS;
		} while (currentState == PLAYING);
	}

	/**
	 * Initialize the game-board contents and the current states
	 * 
	 */
	public static void initGame() {
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLS; ++col) {
				board[row][col] = EMPTY;
			}
		}
		currentState = PLAYING;
		currentPlayer = CROSS;
	}

	/**
	 * Player with the "input" makes one move, with input validation and update
	 * currentRow and currentCol
	 * 
	 * @param input
	 */
	public static void playerMove(int input) {
		boolean validInput = false;
		do {
			if (input == CROSS) {
				System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
			} else {
				System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
			}
			int row = scanner.nextInt() - 1;
			int col = scanner.nextInt() - 1;

			if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) {
				currntRow = row;
				currentCol = col;
				board[currntRow][currentCol] = input;
				validInput = true;
			} else {
				System.out.println("This move at (" + (row + 1) + "," + (col + 1) + ") is not valid. Try again...");
			}
		} while (!validInput);
	}

	/**
	 * Update the currentState after the player with input has placed on
	 * currentRow, currentCol
	 * 
	 * @param input
	 * @param currentRow
	 * @param currentCol
	 */
	public static void updateGame(int input, int currentRow, int currentCol) {
		if (hasWon(input, currentRow, currentCol)) {
			currentState = (input == CROSS) ? CROSS_WON : NOT_WON;
		} else if (isDraw()) {
			currentState = DRAW;
		}
	}

	/**
	 * Return true if it is a draw
	 * 
	 * @return
	 */
	public static boolean isDraw() {
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLS; ++col) {
				if (board[row][col] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Return true if the player with input has won after placing at currentRow,
	 * currentCol
	 * 
	 * @param input
	 * @param currentRow
	 * @param currentCol
	 * @return
	 */
	public static boolean hasWon(int input, int currentRow, int currentCol) {
		return (board[currentRow][0] == input && board[currentRow][1] == input && board[currentRow][2] == input
				|| board[0][currentCol] == input && board[1][currentCol] == input && board[2][currentCol] == input
				|| currentRow == currentCol && board[0][0] == input && board[1][1] == input && board[2][2] == input
				|| currentRow + currentCol == 2 && board[0][2] == input && board[1][1] == input
				&& board[2][0] == input);
	}

	/**
	 * Print the game board
	 * 
	 */
	public static void printBoard() {
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLS; ++col) {
				printCell(board[row][col]);
				if (col != COLS - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != ROWS - 1) {
				System.out.println("-----------");
			}
		}
		System.out.println();
	}

	/**
	 * Print a cell with the specified content
	 * 
	 * @param content
	 */
	public static void printCell(int content) {
		switch (content) {
		case EMPTY:
			System.out.print("   ");
			break;
		case NOT:
			System.out.print(" O ");
			break;
		case CROSS:
			System.out.print(" X ");
			break;
		}
	}
}
