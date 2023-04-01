package IA;

import java.util.Scanner;

public class Main{

    public static void main(String[] arg) {

// Player details
        Player player = new Player();
        player.setName("Shedeur");
        player.setHitPoints(2000);
        player.setDamagePoints(0);

        Enemy enemy = new Enemy();
        enemy.setName("Scorpion");
        enemy.setHitPoints(2000);
        enemy.setType("Beginner");

// using loop to let them attack each other
        Scanner scanner = new Scanner(System.in);
        System.out.println("SCORE: " + player.getName() + ": " + player.getHitPoints() + " ----- " +
                enemy.getName() + "("+ enemy.getType()+ "): " + enemy.getHitPoints());
        boolean mode = true;

        while (mode) {
            System.out.print("Your Attack (1 - 1000): ");
            int points = scanner.nextInt();
            if(points < 0)
                break;

            player.setDamagePoints(points);
            player.attack(enemy);
            enemy.takeDamage(points);
            player.gainExperience(points);
            System.out.println("SCORE: " + player.getName() + ": " + player.getHitPoints() + " ----- " + enemy.getName() + ":" + enemy.getHitPoints());

            System.out.print("Enemy Attack (1 - 1000): ");
            points = scanner.nextInt();
            enemy.setDamagePoints(points);
            enemy.attack(player);
            System.out.println("SCORE: " + player.getName() + ":" +player.getHitPoints() + " ----- " + enemy.getName() + ":" + enemy.getHitPoints());

            if(player.getHitPoints() <= 0) {
                System.out.println("Enemy Wins");
                mode = false;
            }
            else if(enemy.getHitPoints() <= 0) {
                System.out.println("Player Wins");
                mode = false;
            }
            else if(player.getHitPoints() == enemy.getHitPoints()) {
                System.out.println("DRAW");
                mode = false;
            }
        }

        System.out.println("GAME OVER");
    }
}