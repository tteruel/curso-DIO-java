package heranca;

public class Supervisor extends Funcionario {

    public double calcularImposto(){
        return this.getSalario()*0.05;
    }
}
