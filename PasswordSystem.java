public class PasswordSystem {
    public static void main(String[] args) {
        Level1TextualPassword level1 = new Level1TextualPassword();
        Level2GraphicalPassword level2 = new Level2GraphicalPassword();
        Level3BehavioralAuth level3 = new Level3BehavioralAuth();

        System.out.println("Three-Level Password Authentication System");

        if (level1.authenticate()) {
            System.out.println("Level 1 authentication successful!");
            if (level2.authenticate()) {
                System.out.println("Level 2 authentication successful!");
                if (level3.authenticate()) {
                    System.out.println("Access granted. All levels authenticated successfully.");
                } else {
                    System.out.println("Level 3 authentication failed.");
                }
            } else {
                System.out.println("Level 2 authentication failed.");
            }
        } else {
            System.out.println("Level 1 authentication failed.");
        }
    }
}
