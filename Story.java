import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Story {
    private Character character;
    private String wifeLocation;  
    private List<String> locations; 

    public Story(Character character) {
        this.character = character;
        
        this.locations = new ArrayList<>(Arrays.asList("Land of The Dead (Orc territory)",
                "Den of Thieves (Goblin territory)",
                "Land of Flames (Demon territory)",
                "The Swamps (Mud Glups territory)",
                "Great Halls (Giant territory)"));
        
        
        Random random = new Random();
        int randomIndex = random.nextInt(locations.size());
        wifeLocation = locations.get(randomIndex);
    }

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay " + character.name + ", it is time to start your journey.");
        System.out.println("Options...");
        System.out.println("1: Continue to game.");
        System.out.println("2: Quit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                startGame();
                break;
            case 2:
                break;
        }scanner.close();
    } 

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wake up " + character.name + "! Last night in your slumber a curse fell upon your wife.");
        System.out.println("She began to wander while she slept. And thy enemies now hold her! But no one knows who?");
        System.out.println("It is up to you to find her. There are 5 lands where she may be.");
        
        while (true) {
            
            System.out.println("Choose your path:");
            for (int i = 0; i < locations.size(); i++) {
                System.out.println((i + 1) + ": " + locations.get(i));
            }

            int choice = scanner.nextInt();
            String chosenLocation = locations.get(choice - 1);  // User's chosen location

            
            if (!goThroughPath(chosenLocation)) {
                
                System.out.println("After defeating every foe you realize that your wife is not in the " + chosenLocation + ". You keep looking!");
                locations.remove(choice - 1);  

                
                if (locations.size() == 1) {
                    wifeLocation = locations.get(0);
                    System.out.println("You have one last chance: the remaining location is where your wife is.");
                    break;  
                }
            } else {
                break;  
            }
        }

        scanner.close();
    }

    
    private boolean goThroughPath(String location) {
        Scanner scanner = new Scanner(System.in);

        
        switch (location) {
            case "Land of The Dead (Orc territory)":
                System.out.println("You have entered the Land of The Dead. The Orcs guard the path fiercely.");
                OrcBattle orcBattle = new OrcBattle(character);
                orcBattle.battle();
                
                
                break;
            case "Den of Thieves (Goblin territory)":
                System.out.println("You enter the Den of Thieves. Goblins surround you, offering riches.");
                GoblinBattle goblinBattle = new GoblinBattle(character);
                goblinBattle.battle();
                
                
                break;
            case "Land of Flames (Demon territory)":
                System.out.println("The Land of Flames is scorching, full of dangerous demons.");
                DemonBattle demonBattle = new DemonBattle(character);
                demonBattle.battle();
                
                
                break;
            case "The Swamps (Mud Glups territory)":
                System.out.println("The swamps are wet and dangerous, full of Mud Glups.");
                MudBattle mudBattle = new MudBattle(character);
                mudBattle.battle();
                
                
                break;
            case "Great Halls (Giant territory)":
                System.out.println("The Great Halls are magnificent but full of terrifying giants.");
                GiantBattle giantBattle = new GiantBattle(character);
                giantBattle.battle();
                
                
                break;
            default:
                return false; 
        } 

        
        if (location.equals(wifeLocation)) {
            System.out.println("Congratulations, " + character.name + "! You have found your wife in the " + location + ".");
            return true;  
        }

        return false;  
    }
}


