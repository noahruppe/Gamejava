public class Archer extends Character {
    // keep track of archer characteristics
    public Archer(){
        super("Archer", 1000, 55);

    }

    @Override
    public void displayCharacterinfo(){
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " +attackPower);
    }
}