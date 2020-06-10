package heranca;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome(){ return this.nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto(){
            return this.getSalario()*0.1;
    }
}
