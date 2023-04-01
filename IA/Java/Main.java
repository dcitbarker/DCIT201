public class Main{ 

    public static void main(String[] arg) {

// Player details
        Player player = new Player();
        player.setName("Shedeur");
        player.setHitPoints(5000);
        player.setDamagePoints(1500);

        Enemy enemy = new Enemy();
        enemy.setName("Corrupt");
        enemy.setHitPoints(5000);
        enemy.setType("Beginner");

// using loop to let them attack each other
        Scanner scanner = new Scanner(System.in);
        boolean mode = true;

        player.attack(enemy);


        System.out.println("Enemy Hits: "+ enemy.getHitPoints());
    }
}