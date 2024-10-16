package ValidSodokuDemo;

import java.util.HashSet;
import java.util.Set;

public class Solution 
{
    // Method to validate the Sudoku board
    public boolean isValidSudoku(char[][] board) 
    {
        // Loop over each row
        for (int i = 0; i < 9; i++) 
        {
            // HashSets to track seen values in rows, columns, and 3x3 subgrids (cubes)
            Set<Character> rows = new HashSet<Character>();
            Set<Character> columns = new HashSet<Character>();
            Set<Character> cube = new HashSet<Character>();

            // Loop over each column (to check rows and columns simultaneously)
            for (int j = 0; j < 9; j++) 
            {
                // Check for duplicates in the current row
                if (board[i][j] != '.' && !rows.add(board[i][j])) 
                {
                    // If the value was already added to the HashSet, it's a duplicate
                    return false;
                }

                // Check for duplicates in the current column
                if (board[j][i] != '.' && !columns.add(board[j][i])) 
                {
                    // If the value was already added to the HashSet, it's a duplicate
                    return false;
                }

                // Calculate the row and column index of the current 3x3 subgrid (cube)
                int rowIndex = 3 * (i / 3);      // Top row index of the current 3x3 cube
                int colIndex = 3 * (i % 3);      // Left column index of the current 3x3 cube

                // Check for duplicates in the current 3x3 cube
                if (board[rowIndex + j / 3][colIndex + j % 3] != '.' && 
                    !cube.add(board[rowIndex + j / 3][colIndex + j % 3])) 
                {
                    // If the value was already added to the HashSet, it's a duplicate
                    return false;
                }
            }
        }

        // If no duplicates are found in rows, columns, and cubes, return true
        return true;
    }

    // Main method for testing the isValidSudoku method
    public static void main(String[] args) 
    {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Example of a valid Sudoku board
        char[][] validBoard = 
        {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '8', '6', '.', '.', '.', '3'},
            {'4', '.', '9', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '7', '2', '.', '.', '4', '8'},
            {'9', '.', '.', '.', '.', '.', '7', '5', '6'},
            {'3', '5', '7', '.', '.', '9', '.', '.', '8'},
            {'.', '8', '6', '.', '.', '7', '2', '9', '.'}
        };

        // Example of an invalid Sudoku board (due to repetition in the subgrid)
        char[][] invalidBoard = 
        {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '8', '6', '.', '.', '.', '3'},
            {'4', '.', '9', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '7', '2', '.', '.', '4', '8'},
            {'9', '.', '.', '.', '.', '.', '7', '5', '6'},
            {'3', '5', '7', '.', '.', '9', '.', '.', '8'},
            {'.', '8', '6', '.', '.', '7', '2', '9', '.'}
        };

        // Test the valid board
        System.out.println("Valid board: " + solution.isValidSudoku(validBoard)); // Expected output: true

        // Test the invalid board
        System.out.println("Invalid board: " + solution.isValidSudoku(invalidBoard)); // Expected output: false
    }
}

