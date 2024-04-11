public class Sirenencounter extends Scene{

    
        public Sirenencounter(String description, String[] options) {
            super(description, options);
        
        }

        public Sirenencounter() {
            super("As you approach the underwater kingdom of the Sirens, you are greeted by a group of enchanting ethereal beings. They listen to your plea for battle help with concern, offering their assistance in defeating the kraken.",
                    new String[]{"Accept the Sirens help and devise a plan together which includes seeking the cloven elders.",
                                 "Tell the Sirens you do not want to seek another village just to watch them become magical rubble. Exhibit weakness",
                                 "Attempt to  brazenly intimidate a compromise out of the kraken instead."});
        }
    
        @Override
        public void handleOutcome(int choice, Player player) {
            switch (choice) {
                case 1:
                int healthPoints=
                player.getHealthPoints();
                player.setHealthPoints(healthPoints-17);
                    // Handle outcome for choice 1
                    break;
                case 2:
                int stamina=
                player.getStamina();
                player.setStamina(stamina-22);
                System.out.println(player);
                    // Handle outcome for choice 2
                    break;
                case 3:
                int magic=player.getMagic();
                player.setMagic(magic+21);
                    // Handle outcome for choice 3
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
    

