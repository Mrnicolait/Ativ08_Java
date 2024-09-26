package polimorfismo;

public class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();
    }
}

