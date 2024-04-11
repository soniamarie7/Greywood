
    import java.util.Scanner;

    public class Greywood {
    Player player = new Player("Eldorn of Baltica");
    
        private String description;
        private String[] choices;
    
        // Constructor
        public Greywood(String description, String[] choices) {
            this.description = description;
            this.choices = choices;
        }
    
        // Method to display the scene description and choices
        public void displayScene() {
            System.out.println(description);
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i + 1) + ". " + choices[i]);
            }
        }
    
        // Method to get user choice
        public int getUserChoice() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                return choice;
                
            }
        }
    
        // Method to handle scene outcome based on user choice and player properties
        public void handleOutcome(int choice, Player player)
         {
            // Logic to handle outcome based on user choice and player properties
            // You can implement this based on the specific requirements of each scene
        }
    }

