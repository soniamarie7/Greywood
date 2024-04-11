import java.util.Scanner;

public class Scene {
    String description;
    String options[];

    public Scene(String description, String options[]) {
        this.description = description;
        this.options = options;

    }

    public void handleOutcome(int choice, Player player) {}

    public void displayScene() {
        System.out.println(this.description);
        for (int i = 0; i < this.options.length; i++) {
            System.out.print(i + 1);
            System.out.print(" . ");
            System.out.println(this.options[i]);
        }

    }
    public int getUserChoice(Scanner scanner){return 0;}
}