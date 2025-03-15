import java.util.ArrayList;
import java.util.Scanner;

public class GiantBattle {
    private Character player;
    private Enemy giant;
    private ArrayList<Weapon> availableWeapons;

    public GiantBattle(Character player){
        this.player = player;
        this.giant = new Enemy("Giant", 0, 0);

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
        System.out.println("The ground shakes as you venture into the giant's territory.");
        System.out.println("A towering giant approaches, its footsteps shaking the earth. It roars and readies its massive club.");
        System.out.println("A battle to the death begins!");

        System.out.println("");
        
        System.out.println("Player Stats: ");
        System.out.println("Name: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Attack Power: " + player.getAttackPower());
        player.displayWeapons();

        System.out.println("");
        System.out.println("");

        System.out.println("Giant Stats: ");
        System.out.println("Name: " + giant.getName());
        System.out.println("Health: " + giant.gethealth());
        System.out.println("Attack Power: " + giant.getattackPower());

        // If the Giant is stronger than the player, give the option to train
        if(giant.getattackPower() > player.getAttackPower()){
            System.out.println(player.getName() + ", you are not strong enough for the enemy. But it is your choice.");
            System.out.println("1. Fight");
            System.out.println("2. Run & Gain New Skill");

            int choice = scanner.nextInt();  

            if (choice == 2) {
                trainAndGainNewSkills();
                battle();  // After training, continue the battle again
            } else if (choice == 1) {
                fightGiant(); // Directly proceed to fighting
            }
        } else {
            fightGiant();  // If player is strong enough, proceed directly to the fight
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

        System.out.println("Giant Stats: ");
        System.out.println("Name: " + giant.getName());
        System.out.println("Health: " + giant.gethealth());
        System.out.println("Attack Power: " + giant.getattackPower());
    }

    private void fightGiant() {
        // Logic for the actual battle goes here
        System.out.println(player.getName() + " begins the battle against the Giant!");

        // Simulate combat logic
        while (player.getHealth() > 0 && giant.gethealth() > 0) {
            // Player attacks the Giant
            giant.setHealth(giant.gethealth() - player.getAttackPower()); // Giant takes damage from player
            System.out.println(player.getName() + " attacks the Giant! Giant health is now " + giant.gethealth());

            // Giant counter-attacks
            if (giant.gethealth() > 0) {
                player.setHealth(player.getHealth() - giant.getattackPower()); // Player takes damage from Giant
                System.out.println("The Giant attacks " + player.getName() + "! Your health is now " + player.getHealth());
            }

            // Check if player is dead
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " has been defeated by the Giant! You have died.");
                System.exit(0);
            }

            // Check if Giant is dead
            if (giant.gethealth() <= 0) {
                System.out.println("You have defeated the Giant!");
                break;
            }
        }
    }
}
