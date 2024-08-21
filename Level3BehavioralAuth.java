import java.util.Scanner;

public class Level3BehavioralAuth {
    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word 'Authenticate' as fast as possible: ");
        long startTime = System.currentTimeMillis();
        String input = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        // Simulated behavioral check: time taken to type the word
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + " ms");
        
        return input.equalsIgnoreCase("Authenticate") && timeTaken < 5000; // 5 seconds threshold
    }
}
