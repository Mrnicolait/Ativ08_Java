
package Heranca;

public class Funcionario2 {
    protected String nome;
    protected double salario;

    // Construtor da classe base
    public Funcionario2(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para exibir dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }

    // Método calcularBonus (será sobrescrito nas subclasses)
    public double calcularBonus() {
        return 0;
    }

    // Método trabalhar
    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    // Subclasse Gerente
    public static class Gerente extends Funcionario2 {

        // Construtor
        public Gerente(String nome, double salario) {
            super(nome, salario);
        }

        // Sobrescreve o método calcularBonus para Gerente
        @Override
        public double calcularBonus() {
            return salario * 0.20; // Bônus de 20%
        }

        // Sobrescreve o método trabalhar para Gerente
        @Override
        public void trabalhar() {
            System.out.println(nome + " está gerenciando a equipe.");
        }
    }

    // Subclasse Desenvolvedor
    public static class Desenvolvedor extends Funcionario2 {

        // Construtor
        public Desenvolvedor(String nome, double salario) {
            super(nome, salario);
        }

        // Sobrescreve o método calcularBonus para Desenvolvedor
        @Override
        public double calcularBonus() {
            return salario * 0.10; // Bônus de 10%
        }

        // Sobrescreve o método trabalhar para Desenvolvedor
        @Override
        public void trabalhar() {
            System.out.println(nome + " está desenvolvendo software.");
        }
    }

    // Método main para testar
    public static void main(String[] args) {
        // Criando um Gerente
        Gerente gerente = new Gerente("Carlos", 5000.0);
        gerente.exibirDados();
        System.out.println("Bônus: R$ " + gerente.calcularBonus());
        gerente.trabalhar(); // Chamando o método trabalhar

        System.out.println(); // Separador

        // Criando um Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("Ana", 3000.0);
        dev.exibirDados();
        System.out.println("Bônus: R$ " + dev.calcularBonus());
        dev.trabalhar(); // Chamando o método trabalhar
    }
}
