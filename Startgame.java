import java.util.ArrayList;
import java.util.Scanner;

public class Startgame {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your character.");

        System.out.println("1: Warrior");
        System.out.println("2: Wizard");
        System.out.println("3: Archer");
        System.out.println("4: Thief");
        System.out.println("5: Quit");

        int choice =  scanner.nextInt();

        Character character= null;

        switch(choice){
            case 1:
            System.out.println("You have chosen Warrior");
            character = new Warrior();
            break;

            case 2:
            System.out.println("You have chosen Wizard");
            character = new Wizard();
            break;

            case 3:
            System.out.println("You have chosen Archer");
            character = new Archer();
            break;

            case 4: 
            System.out.println("You have chosen Thief");
            character = new Thief();
            break;

            case 5:
            System.out.println("See you next time");
            break;
        }
        if (character != null) {

            character.displayCharacterinfo();
            // Now let the user choose weapons
            ArrayList<Weapon> availableWeapons = new ArrayList<>();
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

            System.out.println("Choose your weapon warning choose wisely or you might pick the wrong weapon. Think about your character");

            for (int i = 0; i < availableWeapons.size(); i++) {
                System.out.println((i + 1) + ": " + availableWeapons.get(i).getName());
            }

            int weaponChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (weaponChoice >= 1 && weaponChoice <= availableWeapons.size()) {
                Weapon selectedWeapon = availableWeapons.get(weaponChoice - 1);
                character.addWeapon(selectedWeapon);  // Adjust stats based on weapon
                System.out.println("You have chosen the " + selectedWeapon.getName() + "!");
            } else {
                System.out.println("Invalid choice, no weapon selected.");
            }

            character.displayCharacterinfo();
            character.displayWeapons(); // Display selected weapons

            
            Story story = new Story(character);
            story.startMenu();
        }

        scanner.close();
        
    }
}
