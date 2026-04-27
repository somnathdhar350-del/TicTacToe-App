import java.util.Scanner;

public class UC4 {

    // Method to convert slot number into row and column
    public static void convertSlot(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot " + slot + " is at:");
        System.out.println("Row = " + row);
        System.out.println("Column = " + col);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        convertSlot(slot);
    }
}