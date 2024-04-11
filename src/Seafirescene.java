
    public class Seafirescene extends Scene { 
        public Seafirescene() {
            super("You arrive at the edge of the sea, where the water burns with an eerie green flame. The kraken looms in the distance, threatening your village. You must act quickly to save your family and your home.",
                    new String[]{"Build a vessel and brave the fiery sea to confront the kraken.",
                                 "Seek help from the sirens deep within the sea, known for their wisdom and magic.",
                                 "Retreat and seek assistance from neighboring villages."});
        }
    
        @Override
        public void handleOutcome(int choice, Player player) {
            switch (choice) {
                case 1:
                    // Handle outcome for choice 1 - lose health or stamina or maybe both
                   int healthPoints=
                   player.getHealthPoints();
                   player.setHealthPoints(healthPoints-25);
                   int stamina=
                   player.getStamina();
                   player.setStamina(stamina-42);
                   System.out.println(player);
                    break;
                case 2:
                int magic=player.getMagic();
                player.setMagic(magic+36);
                    // Handle outcome for choice 2 - correct
                    break;
                case 3:
                 int experienceLevel=
                 player.getExperienceLevel();
                 player.setExperienceLevel(experienceLevel+5);
                // Handle outcome for choice 3
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
    

