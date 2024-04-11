public class KrakenBattleScene extends Scene {
    // Constructor
    public KrakenBattleScene() {
        super("You stand at the edge of the tumultuous ocean, facing the deadly kraken with the army of mystical creatures summoned by the Cloven Elders at your side. The kraken roars, its tentacles thrashing in the green fiery water. It's time to fight for your village and your family!",
                new String[] { "Command the army to attack the kraken head-on.",
                        "Use strategy and tactics to outmaneuver the kraken.",
                        "Channel your magic and summon elemental forces to aid in the battle." });
    }

    // Method to handle outcome based on user choice and player properties
    @Override
    public void handleOutcome(int choice, Player player) {
        switch (choice) {
            case 1:
                System.out.println(
                        "You command the army to charge head-on at the kraken, engaging it in direct combat. Despite the kraken's immense strength, your army fights valiantly, pushing back against the sea monster's onslaught.");
                        int healthPoints=
                        player.getHealthPoints();
                        player.setHealthPoints(healthPoints-10);
                break;
            case 2:
                System.out.println(
                        "You devise a clever strategy to outmaneuver the kraken, using the terrain and the abilities of your mystical allies to gain the upper hand. With precision and coordination, you lead your forces to victory.");
                        int magic=player.getMagic();
                        player.setMagic(magic+21);
                break;
            case 3:
                System.out.println(
                        "You tap into your magical abilities, summoning elemental forces to aid in the battle against the kraken. Fire, water, earth, and air swirl around you, enhancing your attacks and weakening the kraken's defenses. With the power of magic on your side, you emerge victorious.");
                        int experienceLevel=
                        player.getExperienceLevel();
                        player.setExperienceLevel(experienceLevel+7);
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }
}
