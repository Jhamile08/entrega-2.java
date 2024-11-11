package ejercicio12;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Guerrero y Mago
        Character warrior = new Warrior("Thor", 10, 75);
        Character mage = new Magician("Gandalf", 12, 90);

        // Realizar ataques
        warrior.attack();
        mage.attack();
    }
}
