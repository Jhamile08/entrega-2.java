package Ejercicio13;

public class Bird extends Animal {
    public Bird(String nombre) {
        super(nombre);
    }

    @Override
    public void Sound() {
        System.out.println("fiofio");
    }

}
