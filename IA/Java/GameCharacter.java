public class GameCharacter{

    private String name;
    private int hitPoints;
    private int damagePoints;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamagePoints() {
        return this.damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }


    public void attack(GameCharacter character) {
        character.setHitPoints(character.getHitPoints() - this.damagePoints);
    }
}