
package polimorfismo2;

public class Vaca extends Animal {
    @Override
    public void emitirSom() {
        System.out.println(" Muu!");
    }

    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        vaca.emitirSom();
    }
}
