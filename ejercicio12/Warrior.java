package ejercicio12;

public class Warrior extends Character {
    private int strength;

    public Warrior(String name, int level, int magicPower) {
        super(name, level);
        this.strength = magicPower;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attack with his word with force of " + strength);
    }

}
