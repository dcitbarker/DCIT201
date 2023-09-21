package IA;

public class Player extends GameCharacter {

    private int level;
    private int experiencePoints;

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return this.experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void gainExperience(int experiencePoints) {
        this.setExperiencePoints(getExperiencePoints() + experiencePoints);
        if(this.experiencePoints > this.level) {
            this.setLevel(this.getLevel() + experiencePoints);
//            this.setHitPoints(this.getHitPoints() + experiencePoints);
            this.setDamagePoints(this.getDamagePoints() + experiencePoints);
        }
    }
}