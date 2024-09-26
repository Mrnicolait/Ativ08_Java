package abstracao2;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario() + funcionario.calcularBonus();
        }
        return total;
    }

    public void promoverFuncionario(int index, String novoTipo) {
        Funcionario funcionario = funcionarios.get(index);
        String nome = funcionario.getNome();
        double salarioBase = funcionario.getSalarioBase();

        if (novoTipo.equalsIgnoreCase("Gerente")) {
            funcionarios.set(index, new Gerente(nome, salarioBase * 1.5)); // Aumento ao promover para Gerente
        } else if (novoTipo.equalsIgnoreCase("Desenvolvedor")) {
            funcionarios.set(index, new Desenvolvedor(nome, salarioBase * 1.2)); // Aumento ao promover para Desenvolvedor
        } else if (novoTipo.equalsIgnoreCase("Estagiario")) {
            funcionarios.set(index, new Estagiario(nome, salarioBase)); // Mantém o mesmo salário
        }
    }

    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

        sistema.adicionarFuncionario(new Gerente("Alice", 5000));
        sistema.adicionarFuncionario(new Desenvolvedor("Bob", 4000));
        sistema.adicionarFuncionario(new Estagiario("Carlos", 2000));

        double totalFolha = sistema.calcularFolhaPagamento();
        System.out.println("Total da folha de pagamento: R$ " + totalFolha);

        // Promover Carlos para Desenvolvedor
        sistema.promoverFuncionario(2, "Desenvolvedor");

        totalFolha = sistema.calcularFolhaPagamento();
        System.out.println("Total da folha de pagamento após promoção: R$ " + totalFolha);
    }
}

