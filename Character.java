import java.util.ArrayList;

public abstract class Character{
    protected String name;
    protected int health;
    protected int attackPower;
    private ArrayList<Weapon> weapons;
    private Weapon weapon;
     


    public Character(String name, int health, int attackPower ){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.weapons = new ArrayList<>();
        
    }

    public abstract void displayCharacterinfo();

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
        attackPower += weapon.getAttackPower();
        adJustStatesForWeapon(weapon);
        displayWeapons();
    }

    public void adJustStatesForWeapon(Weapon weapon){
        if(this instanceof Warrior && weapon.getName().equals("Fire Power")){
            attackPower -= 20;
            System.out.println("Warning: As a Warrior, your attack power is reduced for using a Fire Power for lack of skill! -20");
        }
        if(this instanceof Warrior && weapon.getName().equals("Lightning Power")){
            attackPower -= 20;
            System.out.println("Warning: As a Warrior, your attack power is reduced for using a Lightning Power for lack of skill! -20");
        }
        if(this instanceof Warrior && weapon.getName().equals("Ice Power")){
            attackPower -= 20;
            System.out.println("Warning: As a Warrior, your attack power is reduced for using a Ice Power for lack of skill! -20");
        }
        if(this instanceof Warrior && weapon.getName().equals("Long Bow")){
            attackPower += 5;
            System.out.println("Warning: As a Warrior, your attack power is increased slightly for using a Long Bow for lack of skill! +5");
        }
        if(this instanceof Warrior && weapon.getName().equals("Cross Bow")){
            attackPower += 5;
            System.out.println("Warning: As a Warrior, your attack power is increased slightly for using a Cross Bow for lack of skill! +5");
        }
        if(this instanceof Warrior && weapon.getName().equals("Sling Shot")){
            attackPower -= 5;
            System.out.println("Warning: As a Warrior, your attack power is reduced for using a Sling Shot for lack of skill! -5");
        }
        if(this instanceof Warrior && weapon.getName().equals("Dagger")){
            attackPower += 5;
            System.out.println("Warning: As a Warrior, your attack power is increased slightly for using a Dagger for lack of skill! +5");
        }
        if(this instanceof Warrior && weapon.getName().equals("Poison")){
            attackPower -= 50;
            System.out.println("Warning: As a Warrior, your attack power is reduced for using Poison for lack of skill! -50");
        }
        if(this instanceof Warrior && weapon.getName().equals("Smoke")){
            attackPower -= 1;
            System.out.println("Warning: As a Warrior, your attack power is reduced for using Smoke for lack of skill! -1");
        }
        if(this instanceof Wizard && weapon.getName().equals("Sword")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Sword for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Long Axe")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Long Axe for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Club")){
            attackPower -= 110;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Club for lack of skill! -110");
        }
        if(this instanceof Wizard && weapon.getName().equals("Long Bow")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Long Bow for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Cross Bow")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Cross Bow for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Sling Shot")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Sling Shot for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Dagger")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using a Dagger for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Poison")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using Poison for lack of skill! -100");
        }
        if(this instanceof Wizard && weapon.getName().equals("Smoke")){
            attackPower -= 100;
            System.out.println("Warning: As a Wizard, your attack power is reduced for using Smoke for lack of skill! -100");
        }
        if(this instanceof Archer && weapon.getName().equals("Sword")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using a Sword for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Long Axe")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using a Long Axe for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Club")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using a Club for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Fire Power")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using Fire Power for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Lightning Power")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using Lightning Power for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Ice Power")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using Ice Power for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Dagger")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using a Dagger for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Poison")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using Poison for lack of skill! -20");
        }
        if(this instanceof Archer && weapon.getName().equals("Smoke")){
            attackPower -= 20;
            System.out.println("Warning: As a Archer, your attack power is reduced for using Smoke for lack of skill! -20");
        }
        if(this instanceof Thief && weapon.getName().equals("Sword")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using a Sword for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Long Axe")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using a Long Axe for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Club")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using a Club for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Fire Power")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using Fire Power for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Lightning Power")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using Lightning Power for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Ice Power")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using Ice Power for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Long Bow")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using a Long Bow for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Cross Bow")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using a Cross Bow for lack of skill! -50");
        }
        if(this instanceof Thief && weapon.getName().equals("Sling Shot")){
            attackPower -= 50;
            System.out.println("Warning: As a Thief, your attack power is reduced for using a Sling Shot for lack of skill! -50");
        }
        
    }

    // public void displayWeapons() {
    //     System.out.println("Weapons:");
    //     int totalAttackPower = 0;  // To keep track of total attack power
    //     for (Weapon weapon : weapons) {
    //         System.out.println(weapon.getName() + " (Attack Power: " + weapon.getAttackPower() + ")");
    //         totalAttackPower += weapon.getAttackPower();  // Add each weapon's attack power to total
    //     }
    //     System.out.println("Total Attack Power: " + totalAttackPower);  // Display the combined attack power
    // }

    public int getAttackPower() {
        return attackPower;
    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public Weapon getWeapon(){
        return weapon;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);  // Ensures health doesn't go below 0
    }

    // public void chooseWeapon(Weapon weapon) {
    //     this.weapon = weapon;
    //     this.attackPower += weapon.getAttackPower(); // Adjust the attack power based on the weapon's attack power
    // }

    public void chooseWeapon(Weapon weapon) {
        this.weapons.add(weapon);  // Add the weapon to the player's list
    }
    
    public void updateAttackPower(Weapon weapon) {
        this.attackPower += weapon.getAttackPower();  // Update the total attack power
    }
    
    public void displayWeapons() {
        System.out.println("Weapons:");
        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName() + " (Attack Power: " + weapon.getAttackPower() + ")"); 
        }
        
    }
    
}