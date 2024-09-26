package polimorfismo2;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println(" Miau!");
    }

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitirSom();
    }
}

