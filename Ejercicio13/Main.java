package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes animales
        Animal dog = new Dog("Bobby");
        Animal catAnimal = new Cat("Mimi");
        Animal bird = new Bird("Piolín");

        // Llamar a hacerSonido() usando polimorfismo
        dog.Sound(); // Salida: Bobby dice: ¡Guau guau!
        catAnimal.Sound(); // Salida: Mimi dice: ¡Miau miau!
        bird.Sound(); // Salida: Piolín dice: ¡Pío pío!
    }
}
