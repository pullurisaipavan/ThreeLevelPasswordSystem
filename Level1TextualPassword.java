import java.util.Scanner;

public class Level1TextualPassword {
    private final String correctPassword = "securePassword123";

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your textual password: ");
        String password = scanner.nextLine();
        return password.equals(correctPassword);
    }
}
