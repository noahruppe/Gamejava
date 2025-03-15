public class Thief extends Character {
    
    public Thief(){
        super("Thief", 700, 40);

    }

    @Override
    public void displayCharacterinfo(){
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " +attackPower);
    }
}
