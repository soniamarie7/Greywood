import java.util.Random;

public class Player {
    public static void main(String[] args) {
    }

    private String name;
    private int healthPoints;
    private int courage;
    private int stamina;
    private int magic;
    private int experienceLevel;

    // Constructor
    public Player() {
        this.healthPoints = 100;
        this.courage = 11;
        this.stamina = 100;
        this.magic = 15;
        this.experienceLevel = 5;
    }

    public Player(String string) {
        this();
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public int setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;

    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", healthPoints=" + healthPoints + ", courage=" + courage + ", stamina="
                + stamina + ", magic=" + magic + ", experienceLevel=" + experienceLevel + "]";
    }

    public boolean savedFamily() {
        Random random = new Random();
        return random.nextBoolean();

    }

    public boolean isAlive() {
        return this.healthPoints > 0;

    }

}

// Getters and setters...
