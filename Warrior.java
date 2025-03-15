

public class Warrior extends Character {
    //character
    public Warrior(){
        super("Warrior", 1500, 70);

    }

    @Override
    public void displayCharacterinfo(){
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " +attackPower);
    }
}
