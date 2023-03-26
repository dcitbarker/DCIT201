public class Player extends GameCharacter {

    private int level;
    private int experiencePoints;

    public void gainExperience(int experiencePoints) {
        this.experiencePoints += experiencePoints;
        if(this.experiencePoints > this.level) {
            this.level += experiencePoints;
            this.hitPoints += experiencePoints;
            this.damagePoints += experiencePoints;
        }
    }



}