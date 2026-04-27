public class UC5 {

    // Method to validate user move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] == '-') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'X', '-', 'O'},
                {'-', '-', '-'},
                {'O', 'X', '-'}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}