
    public class Clovenelderscene extends Scene {
       
        public Clovenelderscene() {
            super("You arrive at the ancient grove of the Cloven Elders, where the air hums with ancient magic. The elders, with their elven appearances and wise eyes, gather around you. They sense the urgency of your quest and offer their guidance and support.",
                    new String[]{"Listen attentively to the Cloven Elders and follow their guidance.",
                                 "Express gratitude but decline their offer, opting to stupidly pursue your own path.",
                                 "Question the elders about the nature of the kraken and seek more information before deciding."});
        }
    
       
        @Override
        public void handleOutcome(int choice, Player player) {
            switch (choice) {
                case 1:
                    System.out.println("You listen attentively to the Cloven Elders and follow their guidance. Impressed by your willingness to learn and your respect for their wisdom, the elders decide to lend their support to your cause.");
                    System.out.println("The Cloven Elders summon an army of mystical creatures to aid you in battle against the kraken. As the leader of this army, you prepare to face the great sea monster and save your village.");
                    int healthPoints=
                    player.getHealthPoints();
                    player.setHealthPoints(healthPoints-10);
                     // Update player properties or game state as needed
                    break;
                case 2:
                int stamina=
                player.getStamina();
                player.setStamina(stamina-9);
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

     
