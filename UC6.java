public class UC6 {

    // Method to place move on board
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to display board
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        System.out.println("Before Move:");
        displayBoard(board);

        // Place move
        placeMove(board, 1, 1, 'X');

        System.out.println("After Move:");
        displayBoard(board);
    }
}