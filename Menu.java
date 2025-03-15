import java.util.Scanner;

public class Menu {
    //display menu
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Start Game");
        System.out.println("2: Quit Game");

        System.out.println("Please select one.");
        
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
            System.out.println("Starting the game...");
            Startgame startgame = new Startgame();
            startgame.start();

            break;

            case 2: 
            System.out.println("Quitng the game...");

            break;
        }
        scanner.close();
    }
}

