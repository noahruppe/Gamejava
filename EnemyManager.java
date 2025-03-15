import java.util.ArrayList;


public class EnemyManager {
    private ArrayList<Enemy> enemies;

    public EnemyManager(){
        enemies = new ArrayList<>();

        enemies.add(new Enemy("Goblin", 0, 0));
        enemies.add(new Enemy("Orc", 0, 0));
        enemies.add(new Enemy("Demon", 0, 0));
        enemies.add(new Enemy("Giant", 0, 0));
        enemies.add(new Enemy("Mud Monster", 0, 0));
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }
}

