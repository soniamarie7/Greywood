public class Concludegame {

    public static void main(String[] args) {
        Player player = createPlayer();
        playGame(player);
        concludeGame(player);
    }

    private static Player createPlayer() {
        // Logic to create and customize player
        return new Player();
    }

    private static void playGame(Player player) {
        // Logic to play the game (navigate through scenes, handle choices, update
        // player properties)
    }

    public static void concludeGame(Player player) {
        if (player.isAlive() && player.savedFamily()) {
            System.out.println(
                    "Congratulations! You have successfully saved your family and defeated the kraken. You are hailed as a hero in your village.");
        } else if (!player.isAlive()) {
            System.out.println(
                    "Game Over. Your journey has come to a tragic end. The kraken's fury proved too much for you.");
        } else {
            System.out.println(
                    "Game Over. Despite your efforts, you were unable to save your family from the kraken's wrath.");
        }
        // Display final score or any other relevant information
        
    }
}
