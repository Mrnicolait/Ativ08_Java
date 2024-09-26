package polimorfismo;

public class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando.");
    }

    public static void main(String[] args) {
        Trem trem = new Trem();
        trem.acelerar();
        trem.frear();
    }
}
