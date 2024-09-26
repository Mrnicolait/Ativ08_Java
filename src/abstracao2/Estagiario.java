package abstracao2;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Salário base para Estagiário
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.05; // 5% de bônus
    }
}

