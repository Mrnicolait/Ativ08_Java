package abstracao2;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Salário base para Gerente
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20; // 20% de bônus
    }
}
