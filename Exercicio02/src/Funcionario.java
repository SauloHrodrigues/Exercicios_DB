public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.printf("%s que tem %d anos, tem seu salário" +
                " no valor de: R$ %.2f",getNome(),getIdade(),getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}