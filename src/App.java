import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(new GreywoodScene());
        Player player = new Player();
        player.setName("Eldorn of Baltica");
        System.out.println(player);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name");
        String name = sc.nextLine();

        // Create instances of each scene
        Seafirescene seafirescene = new Seafirescene();
        seafirescene.displayScene();
        int choice=App.getUserChoice(sc);
         seafirescene.handleOutcome(choice, player);
    
        Sirenencounter sirenencounter = new Sirenencounter();
        sirenencounter.displayScene();
        App.getUserChoice(sc);
       
        GreywoodScene greywoodScene = new GreywoodScene();
        greywoodScene.displayScene();
        App.getUserChoice(sc);

        Clovenelderscene clovenelderscene = new Clovenelderscene();
        clovenelderscene.displayScene();
        App.getUserChoice(sc);
        
        KrakenBattleScene krakenBattleScene = new KrakenBattleScene();
        krakenBattleScene.displayScene();
        App.getUserChoice(sc);
       
        Concludegame concludegame = new Concludegame();
        concludegame.concludeGame(player);
        sc.close();

    }

    // Method to get user choice
    public static int getUserChoice(Scanner sc) {
        System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            return choice;

        }
    

    // Method to handle scene outcome based on user choice and player properties
    public static void handleOutcome(int choice, Player player) {
        // Logic to handle outcome based on user choice and player properties
        // You can implement this based on the specific requirements of each scene
    }
}
