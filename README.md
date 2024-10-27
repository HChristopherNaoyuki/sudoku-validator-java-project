# Valid Sudoku Checker

This project provides a Java implementation for validating Sudoku boards. It checks if a given 9x9 Sudoku board is valid based on the rules of Sudoku, which state that:

- Each row must contain the digits 1-9 without repetition.
- Each column must contain the digits 1-9 without repetition.
- Each of the nine 3x3 subgrids must contain the digits 1-9 without repetition.

## Features

- Validates a Sudoku board represented as a 2D character array.
- Returns `true` for valid boards and `false` for invalid boards.
- Includes a set of unit tests to verify the functionality of the implementation.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- A build tool like Maven or Gradle (optional, for easier dependency management).

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/sudoku-validator-java-project.git
   cd ValidSudokuChecker
   ```

2. Compile the code:
   ```bash
   javac ValidSodokuDemo/Solution.java ValidSodokuDemo/SolutionTest.java
   ```

3. Run the main program:
   ```bash
   java ValidSodokuDemo.Solution
   ```

### Running Tests

To run the unit tests, use a testing framework like JUnit. If you're using Maven, simply run:
```bash
mvn test
```

If you're using JUnit directly, compile the test class and then run it:
```bash
javac -cp .:junit-4.13.2.jar ValidSodokuDemo/SolutionTest.java
java -cp .:junit-4.13.2.jar org.junit.runner.JUnitCore ValidSodokuDemo.SolutionTest
```

## Snippet

```java
char[][] validBoard = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '6', '.', '.', '.', '3', '.'},
    {'4', '.', '9', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '2', '.', '.', '.', '4', '8'},
    {'9', '.', '.', '.', '.', '.', '7', '5', '6'},
    {'3', '5', '7', '.', '.', '9', '.', '.', '8'},
    {'.', '8', '6', '.', '.', '7', '2', '9', '.'}
};

Solution solution = new Solution();
boolean isValid = solution.isValidSudoku(validBoard);
System.out.println("Is the board valid? " + isValid); // Output: true
```

## Tests

The project includes several test cases to validate different scenarios:

- Valid and invalid boards.
- Empty boards.
- Boards with repetitions in rows, columns, and subgrids.

## Contributing

Feel free to open issues for any bugs or feature requests. Pull requests are welcome for improvements and enhancements.
