package heranca;

// Classe Funcionario
public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor da classe base
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para exibir dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }

    // Método calcularBonus (será sobrescrito pelas subclasses)
    public double calcularBonus() {
        return 0;
    }

    // Subclasse Gerente dentro da classe Funcionario
    public static class Gerente extends Funcionario {

        // Construtor que chama o da superclasse
        public Gerente(String nome, double salario) {
            super(nome, salario);
        }

        // Sobrescreve o método calcularBonus para Gerente
        @Override
        public double calcularBonus() {
            return salario * 0.20; // Bônus de 20%
        }
    }

    // Subclasse Desenvolvedor dentro da classe Funcionario
    public static class Desenvolvedor extends Funcionario {

        // Construtor que chama o da superclasse
        public Desenvolvedor(String nome, double salario) {
            super(nome, salario);
        }

        // Sobrescreve o método calcularBonus para Desenvolvedor
        @Override
        public double calcularBonus() {
            return salario * 0.10; // Bônus de 10%
        }
    }

    // Método main para testar as subclasses
    public static void main(String[] args) {
        // Criando um Gerente
        Gerente gerente = new Gerente("Carlos", 5000.0);
        gerente.exibirDados();
        System.out.println("Bônus: R$ " + gerente.calcularBonus());

        System.out.println(); // Separador

        // Criando um Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("Ana", 3000.0);
        dev.exibirDados();
        System.out.println("Bônus: R$ " + dev.calcularBonus());
    }
}
