package abstracao2;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Salário base para Desenvolvedor
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10; // 10% de bônus
    }
}
