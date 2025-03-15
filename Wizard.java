public class Wizard extends Character {
    
    public Wizard(){
        super("Wizard", 2000, 120);

    }

    @Override
    public void displayCharacterinfo(){
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " +attackPower);
    }
}