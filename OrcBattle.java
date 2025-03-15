import java.util.ArrayList;
import java.util.Scanner;

public class OrcBattle {
    private Character player;
    private Enemy orc;
    private ArrayList<Weapon> availableWeapons;

    public OrcBattle(Character player){
        this.player = player;
        this.orc = new Enemy("Orc", 0, 0);

        availableWeapons = new ArrayList<>();

        availableWeapons.add(new Weapon("Sword", 50));
        availableWeapons.add(new Weapon("Long Axe", 70));
        availableWeapons.add(new Weapon("Club", 30));
        availableWeapons.add(new Weapon("Lightning Power", 100));
        availableWeapons.add(new Weapon("Fire Power", 60));
        availableWeapons.add(new Weapon("Ice Power", 50));
        availableWeapons.add(new Weapon("Long Bow", 90));
        availableWeapons.add(new Weapon("Cross Bow", 60));
        availableWeapons.add(new Weapon("Sling Shot", 10));
        availableWeapons.add(new Weapon("Dagger", 40));
        availableWeapons.add(new Weapon("Poison", 50));
        availableWeapons.add(new Weapon("Smoke", 30));
    }

    public void battle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("As you venture deeper into the dense forest, the ground trembles under your feet.");
        System.out.println("Suddenly, an orc emerges from behind the trees, roaring as it charges toward you.");
        System.out.println("The air grows thick with the smell of smoke and earth as the orc prepares to attack.");

        System.out.println("");
        
        System.out.println("Player Stats: ");
        System.out.println("Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Attack Power: " + player.getAttackPower());
        player.displayWeapons();

        System.out.println("");
        System.out.println("");

        System.out.println("Orc Stats: ");
        System.out.println("Name: " + orc.getName());
        System.out.println("Health: " + orc.gethealth());
        System.out.println("Attack Power: " + orc.getattackPower());

        // If the orc is stronger than the player, give the option to train
        if(orc.getattackPower() > player.getAttackPower()){
            System.out.println(player.getName() + ", you are not strong enough for the enemy. But it is your choice.");
            System.out.println("1. Fight");
            System.out.println("2. Run & Gain New Skill");

            int choice = scanner.nextInt();  

            if (choice == 2) {
                trainAndGainNewSkills();
                battle();  // After training, continue the battle again
            } else if (choice == 1) {
                fightOrc(); // Directly proceed to fighting
            }
        } else {
            fightOrc();  // If player is strong enough, proceed directly to the fight
        }
    }

    private void trainAndGainNewSkills() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You train hard and gain a new skill: dual weapon user!");
        System.out.println("Any weapon you choose will increase your attack power because of the new skill.");

        for (int i = 0; i < availableWeapons.size(); i++) {
            System.out.println((i + 1) + ": " + availableWeapons.get(i).getName());
        }

        int choice = scanner.nextInt();

        if (choice > 0 && choice <= availableWeapons.size()) {
            // Get the chosen weapon from the list
            Weapon chosenWeapon = availableWeapons.get(choice - 1); 
            player.chooseWeapon(chosenWeapon); // Add the chosen weapon to the player's list
    
            System.out.println("You have chosen the " + chosenWeapon.getName() + "!");
    
            // Update the player's total attack power
            player.updateAttackPower(chosenWeapon); // Update the attack power with the new weapon
        } else {
            System.out.println("Invalid choice, try again.");
        }

        // Display the player's updated weapons and total attack power
        System.out.println("Player Stats: ");
        System.out.println("Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Attack Power: " + player.getAttackPower());
        player.displayWeapons();

        System.out.println("");
        System.out.println("");

        System.out.println("Orc Stats: ");
        System.out.println("Name: " + orc.getName());
        System.out.println("Health: " + orc.gethealth());
        System.out.println("Attack Power: " + orc.getattackPower());
    }

    private void fightOrc() {
        // Logic for the actual battle goes here
        System.out.println(player.getName() + " begins the battle against the Orc!");

        // Simulate combat logic
        while (player.getHealth() > 0 && orc.gethealth() > 0) {
            // Player attacks orc
            orc.setHealth(orc.gethealth() - player.getAttackPower()); // Orc takes damage from player
            System.out.println(player.getName() + " attacks the orc! Orc health is now " + orc.gethealth());

            // Orc counter-attacks
            if (orc.gethealth() > 0) {
                player.setHealth(player.getHealth() - orc.getattackPower()); // Player takes damage from orc
                System.out.println("The orc attacks " + player.getName() + "! Your health is now " + player.getHealth());
            }

            // Check if player is dead
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " has been defeated by the Orc! You have died.");
                System.exit(0);
            }

            // Check if orc is dead
            if (orc.gethealth() <= 0) {
                System.out.println("You have defeated the orc!");
                break;
            }
        }
    }
}
