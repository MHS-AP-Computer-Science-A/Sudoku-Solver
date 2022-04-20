import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sudoku {

	//Sudoku puzzle array
	public static int[][] puzzle;

	public static void main(String[] args) throws IOException {
		// Initialize the array
		puzzle = new int[9][9];

		// Input all the content from the file into the array
		Scanner file = new Scanner(new File("input.txt"));

		for (int row = 0; row < puzzle.length; row++) {
			for (int col = 0; col < puzzle[0].length; col++) {
				puzzle[row][col] = file.nextInt();
			}
		}

		// Call the display method
		System.out.println("Before Solving: ");
		displayPuzzle();

		// Initial call to the solve method
		solve();

	}

	public static void solve() {
		int r = -1, c = -1;

		// TODO: Set r and c to the first zero in puzzle 
		

		if (r == -1 && c == -1) {
			// TODO: solved, display the puzzle/
		} else {
			for (int num = 1; num <= 9; num++) { // 1-9 are numbers to try
			//TODO:
                        //if( num is legal at puzzle[r][c]) {
					//place number in puzzle 
					// call solve 
			//}
			}
			puzzle[r][c] = 0;
		}
	}


	// POST: Returns true if num can be legally placed at [row][col]
	//       or false otherwise
	public static boolean isLegal(int num, int row, int col) {
		/** TODO Determine if num is illegal at puzzle[row][col] and return false **/

		
		// Otherwise it's legal
		return true;
	}
	
	
	// POST: Displays puzzle neatly formatted
	public static void displayPuzzle() {
           //TODO
	}
	

}
