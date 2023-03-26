pulic class Enemy extends GameCharacter {

    private String type;


    public void takeDamage(int damage) {
        this.hitPoints -= damage;
        System.out.println("Ouch... The enemy just received " + damage + " damage")
    }

}