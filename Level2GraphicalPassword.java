import java.util.Scanner;

public class Level2GraphicalPassword {
    private final String correctSequence = "1-3-2"; // predefined image sequence

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the graphical password sequence (e.g., 1-3-2): ");
        String sequence = scanner.nextLine();
        return sequence.equals(correctSequence);
    }
}
