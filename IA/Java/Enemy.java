public class Enemy extends GameCharacter {

    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void takeDamage(int damage) {
        this.setHitPoints(this.getHitPoints() - damage);
        System.out.println("Ouch... The enemy just received " + damage + " damage");
    }

}