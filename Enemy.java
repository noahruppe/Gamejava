public class Enemy {
    private String name;
    private int attackPower;
    private int health;

    public Enemy( String name, int attackPower, int health) {
        this.name = name;

        enemyhealth();
        setAttackPower();

    }
    // set health
    public void enemyhealth(){
        switch(this.name){
            case "Goblin":
            this.health = 200;
            break;

            case "Orc":
            this.health = 800;
            break;

            case "Demon":
            this.health = 500;
            break;

            case "Giant":
            this.health = 1000;
            break;

            case "Mud Monster":
            this.health = 500;
            break;

            case "King Goblin":
            this.health = 100;
            break;

            case "King Orc":
            this.health = 160;
            break;

            case "King Demon":
            this.health = 240;
            break;

            case "King Giant":
            this.health = 300;
            break;

            case "King Mud Monster":
            this.health = 400;
            break;
        }
    }
    //set attack power
    public void setAttackPower(){
        switch(this.name){
            case "Goblin":
            this.attackPower = 30;
            break;

            case "Orc":
            this.attackPower = 400;
            break;

            case "Demon":
            this.attackPower = 600;
            break;

            case "Giant":
            this.attackPower= 1000;
            break;

            case "Mud Monster":
            this.attackPower = 1200;
            break;

            case "King Goblin":
            this.attackPower = 60;
            break;

            case "King Orc":
            this.attackPower = 200;
            break;

            case "King Demon":
            this.attackPower = 240;
            break;

            case "King Giant":
            this.attackPower = 300;
            break;

            case "King Mud Monster":
            this.attackPower = 400;
            break;

        }
        
    }
    public String getName(){
        return name;
    }

    public int getattackPower(){
        return attackPower;
    }

    public int gethealth(){
        return health;
    }

    public void setHealth(int health) {
    this.health = Math.max(health, 0);  // Ensures health doesn't go below 0
}
    

    
}







