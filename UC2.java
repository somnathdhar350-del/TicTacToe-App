import java.util.Random;

public class UC2 {

    public static void main(String[] args) {

        Random random = new Random();

        String firstPlayer;
        char userSymbol, computerSymbol;

        // Toss to decide first player
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            firstPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            firstPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        // Display result
        System.out.println("Toss Result:");
        System.out.println(firstPlayer + " will play first.");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}