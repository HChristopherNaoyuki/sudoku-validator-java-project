package ValidSodokuDemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest 
{
    // Test case 1: Valid Sudoku board
    @Test
    public void testValidSudoku() 
    {
        // Create an instance of Solution
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

        // Test the valid board
        assertTrue("The board should be valid.", solution.isValidSudoku(validBoard));
    }

    // Test case 2: Invalid Sudoku board due to repetition in subgrid
    @Test
    public void testInvalidSudokuDueToSubgrid() 
    {
        // Create an instance of Solution
        Solution solution = new Solution();

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

        // Test the invalid board
        assertFalse("The board should be invalid due to repetition in the subgrid.", solution.isValidSudoku(invalidBoard));
    }

    // Test case 3: Invalid Sudoku board due to repetition in the row
    @Test
    public void testInvalidSudokuDueToRow() 
    {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example of an invalid Sudoku board (due to repetition in the row)
        char[][] invalidBoard = 
        {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '8', '6', '.', '.', '.', '3'}, // Repetition in the row here
            {'4', '.', '9', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '7', '2', '.', '.', '4', '8'},
            {'9', '.', '.', '.', '.', '.', '7', '5', '6'},
            {'3', '5', '7', '.', '.', '9', '.', '.', '8'},
            {'.', '8', '6', '.', '.', '7', '2', '9', '.'}
        };

        // Test the invalid board
        assertFalse("The board should be invalid due to repetition in the row.", solution.isValidSudoku(invalidBoard));
    }

    // Test case 4: Invalid Sudoku board due to repetition in the column
    @Test
    public void testInvalidSudokuDueToColumn() 
    {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example of an invalid Sudoku board (due to repetition in the column)
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

        // Test the invalid board
        assertFalse("The board should be invalid due to repetition in the column.", solution.isValidSudoku(invalidBoard));
    }

    // Test case 5: Empty Sudoku board (all cells are empty)
    @Test
    public void testEmptySudoku() 
    {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example of an empty Sudoku board (all cells are empty)
        char[][] emptyBoard = new char[9][9];
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                emptyBoard[i][j] = '.';
            }
        }

        // Test the empty board (should be valid)
        assertTrue("The empty board should be valid.", solution.isValidSudoku(emptyBoard));
    }

    // Test case 6: Invalid Sudoku board due to repetition in both row and subgrid
    @Test
    public void testInvalidSudokuDueToRowAndSubgrid() 
    {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example of an invalid Sudoku board (due to repetition in both row and subgrid)
        char[][] invalidBoard = 
        {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '8', '6', '.', '.', '.', '3'}, // Repetition in both row and subgrid here
            {'4', '.', '9', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '7', '2', '.', '.', '4', '8'},
            {'9', '.', '.', '.', '.', '.', '7', '5', '6'},
            {'3', '5', '7', '.', '.', '9', '.', '.', '8'},
            {'.', '8', '6', '.', '.', '7', '2', '9', '.'}
        };

        // Test the invalid board
        assertFalse("The board should be invalid due to repetition in both row and subgrid.", solution.isValidSudoku(invalidBoard));
    }

    // Test case 7: Board with all numbers but still invalid (due to repetition in the grid)
    @Test
    public void testBoardWithAllNumbersButInvalid() 
    {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example of an invalid Sudoku board (valid numbers but repetition)
        char[][] invalidBoard = 
        {
            {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
            {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
            {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
            {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
            {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
            {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
            {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
            {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
            {'3', '4', '5', '2', '8', '6', '1', '7', '9'}
        };

        // Test the invalid board (due to repetition in the row or subgrid)
        assertFalse("The board with all numbers should be invalid due to repetition.", solution.isValidSudoku(invalidBoard));
    }
}
