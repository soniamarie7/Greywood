
public class GreywoodScene extends Scene {
    // Constructor
    public GreywoodScene() {
        super("You enter Greywood and a guarded elder wood elf appears. You are weary from travel and are seeking passage and to speak to a wood Majick elder regarding an attack on your village where you grew up. Your family is in danger from a kraken and the sea is on fire. Land is not your strong suit, and your stamina points are struggling. The guards shield the elder and ask what say you?",
                new String[] { "Try to riddle..., 'The question is Eldorn what say you?'",
                        "Fumble a dandelion in fear and exhaustion and stutter you just want to be allowed to pass and you mean no harm.",
                        "Demonstrate strength and courage and stand tall with infliction you say I need help. My village is burning, and I must save my family. I  was sent by the sirens. Let me pass and see your strongest cloven elder!" });
    }

    // Method to handle outcome based on user choice and player properties
    @Override
    public void handleOutcome(int choice, Player player) {
        switch (choice) {
            case 1:
                // Handle outcome for choice 1
                break;
            case 2:
                // Handle outcome for choice 2
                break;
            case 3:
                // Handle outcome for choice 3
                break;
            default:
                System.out.println("Choice made please proceed to next scene");
                break;
        }
    }
    public void displayScene(){
System.out.println(this.description);
for(int i=0;i<this.options.length;i++){
    System.out.print(i+1);
    System.out.print(" . ");
    System.out.println(this.options[i]);}








    }



    
}
