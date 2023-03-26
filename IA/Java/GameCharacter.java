public class GameCharacter{

    private String name;
    private int hitPoints;
    private int damagePoints;


    public void attack(GameCharacter character) {
        character.hitPoints - this.damagePoints;
    }
}