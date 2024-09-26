package polimorfismo;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando.");
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.acelerar();
        bicicleta.frear();
    }
}

