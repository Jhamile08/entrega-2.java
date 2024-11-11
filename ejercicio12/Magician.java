package ejercicio12;

public class Magician extends Character {
    private int magicPower;

    public Magician(String name, int level, int magicPower) {
        super(name, level);
        this.magicPower = magicPower;
    }

    @Override
    public void attack() {
        System.out.println(getName() + "cast spell");
    }

}
