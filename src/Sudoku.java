import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sudoku {

	//Sudoku puzzle array
	public static int[][] puzzle;


	public static void solve() {
		int r = -1, c = -1;

		// Search puzzle for a 0. When found, set r and c
		// to the row and column of the 0.
		/* your code here  */

		if (r == -1 && c == -1) {
			// no zero was found (base case), display puzzle
            /* your code here */
		} else {
			//Try the numbers 1-9
			for (int num = 1; num <= 9; num++) { 
                //if( num is legal at puzzle[r][c]) {
					//place number in puzzle 
					// call solve 
		        //}
			}
			puzzle[r][c] = 0; // Sets the spot back to 0 when we backtrack
		}
	}


	// POST: Returns true if num can be legally placed at [row][col]
	//       or false otherwise
	public static boolean isLegal(int num, int row, int col) {
		/** Determine if num is illegal at puzzle[row][col] and return false **/
		
		// Check the row 
		
		// Check the column
		
		//Check the box (puzzle[boxRow][boxCol] is the top left corner of the current box)
		int boxRow = row / 3 * 3; 
		int boxCol = col / 3 * 3;
	

		
		// Otherwise it's legal
		return true;
	}
	
	
	// POST: Displays puzzle neatly formatted with grid lines
	public static void displayPuzzle() {
            /* complete this method */
	}



	public static void main(String[] args) throws IOException {
		// Initialize puzzle to an int array with 9 rows and 9 columns
		

		// Create a Scanner object to read from the file
		

		// Traverse the puzzle array and set each element to an input
		//  from the file


		// Call the display method
		System.out.println("Before Solving: ");
		displayPuzzle();

		// Call the solve method
		

	}
}
